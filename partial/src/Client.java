public class Client {
    private String nume;
    private Comanda[] comenzi;  //  contine TOATE comenzile facute
    private int nrComenzi = 0;

    public Client(){
        this.nume = "NUME DEFAULT";
        comenzi = new Comanda[10];  // default size for comenzi
    }

    public Client(String nume, int nrComenzi) {
        this.nume = nume;
        comenzi = new Comanda[nrComenzi];
    }
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    public void addComanda(Comanda com) {
        comenzi[nrComenzi] = com;
        nrComenzi++;
    }

    public int getTotalPriceComenzi(){
        int sum = 0;
        for(Comanda c : comenzi){
            if(c != null){
                sum += c.getTotalCost();
            }

        }
        return sum;
    }

    public String toString(){
        return nume + " a facut " + nrComenzi + " comenzi in valoare de " + getTotalPriceComenzi() + " RON";
    }
}
