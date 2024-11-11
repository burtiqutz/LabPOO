public abstract class Preparat {
    private int pret;
    private String nume;

    public Preparat() {
        this.pret = 0;
        this.nume = "";
    }
    public Preparat(int pret, String nume) {
        this.pret = pret;
        this.nume = nume;
    }

    public int getPret() {
        return pret;
    }
    public void setPret(int pret) {
        this.pret = pret;
    }
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }

    public String toString() {
        return "{" + "pret=" + pret + ", nume=" + nume + '}';
    }
}
