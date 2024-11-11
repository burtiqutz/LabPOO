public class Comanda {
    private int nrLivrare;
    private Preparat[] preparate;
    int statusComanda;  //  0 in asteptare, 1 in livrare, 2 livrat
    int nrPreparate;

    public Comanda() {
        statusComanda = 0;
        nrLivrare = 0;
        preparate = new Preparat[10];
        nrPreparate = 0;
    }

    public Comanda(int nrPreparate) {
        statusComanda = 0;
        nrLivrare = 0;
        preparate = new Preparat[nrPreparate];
        this.nrPreparate = 0;
    }

    public int getNrPreparate() {
        return nrPreparate;
    }

    public void setNrPreparate(int nrPreparate) {
        this.nrPreparate = nrPreparate;
    }

    public int getNrLivrare() {
        return nrLivrare;
    }

    public void setNrLivrare(int nrLivrare) {
        this.nrLivrare = nrLivrare;
    }

    public int getTotalCost() {
        int sum = 0;
        for (Preparat p : preparate) {
            if (p != null) {
                sum += p.getPret();
            }
        }
        return sum;
    }

    public void addPreparat(Preparat p, Restaurant r) {
        if (r != null) {
            if (p != null) {
                if (r.isValidPreparat(p)) {   //  daca nu sunt nule ref si exista in meniu, adaugam
                    preparate[nrPreparate] = p;
                    nrPreparate++;
                }
            }
        }
    }

    public void showComanda() {
        for (Preparat p : preparate) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }

    public void setStatusComanda(int statusComanda) {
        this.statusComanda = statusComanda;
    }

    public int getStatusComanda() {
        return statusComanda;
    }

}
