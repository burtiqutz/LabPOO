import java.util.Arrays;

public class Restaurant {
    private final String NAME = "Restaurantul Grande";
    private Preparat[] tipuriPreparate;
    private Comanda[] comenziRamase;
    private int countPreparate;
    private int countComanda;

    public Restaurant() {
        tipuriPreparate = new Preparat[5];
        comenziRamase = new Comanda[10];    //  default 10 comenzi posibile
    }

    public Restaurant(int nrPreparatePosibile, int nrComandaPosibile) {
        tipuriPreparate = new Preparat[nrPreparatePosibile];
        comenziRamase = new Comanda[nrComandaPosibile];    //  default 10 comenzi posibile
    }

    public void addComanda(Comanda comanda) {
        comenziRamase[countComanda] = comanda;
        countComanda++;
        comanda.statusComanda = 0;  //  in asteptare
        comanda.setNrLivrare(countComanda - 1);
    }

    public void setStatusComanda(int nrComanda, int newStatusComanda) {
        comenziRamase[nrComanda].statusComanda = newStatusComanda;
        if (newStatusComanda == 2) {
            comenziRamase[nrComanda].setNrLivrare(-1);  //  daca e livrata, trecem pe -1 comanda
        }                                               //  in mod normal ar trebui si eliminata, dar sa zicem ca tinem
                                                        //  istoric al comenzilor :))
    }

    public void addToMenu(Preparat p) {
        tipuriPreparate[countPreparate] = p;
        countPreparate++;
    }

    public boolean isValidPreparat(Preparat p) {
        for (Preparat p1 : tipuriPreparate) {
            if (p1 != null) {
                if (p.equals(p1)) {
                    return true;
                }
            }

        }
        return false;
    }

    public void showMenu() {
        System.out.println("Meniul restaurantului:");
        for (Preparat p : tipuriPreparate) {
            if (p != null) {
                if (p instanceof Pizza) {
                    System.out.println("Pizza " + p);
                } else if (p instanceof Desert) {
                    System.out.println("Desert " + p);
                } else if (p instanceof Racoritoare) {
                    System.out.println("Racoritoare " + p);
                }
            }
        }
    }

    public void showNotDelivered() {
        System.out.println("Comenzi in asteptare sau in livrare:");
        //  iau comenzile in functie de nr de livrare, care e de la 0 la count comanda - 1
        //  este putin redundant, pentru ca sunt adaugate oricum in ordine comenzile, insa asa specifica problema.
        //  practic puteam sa ne lipsim de for-ul exterior
        for (int i = 0; i < countComanda; i++) {
            for (Comanda c : comenziRamase) {
                if (c != null) {
                    if (c.statusComanda == 0 || c.statusComanda == 1) {
                        if (i == c.getNrLivrare()) {
                            c.showComanda();
                            System.out.println("Cost total: " + c.getTotalCost());
                        }
                    }
                }
            }
        }
    }
}
