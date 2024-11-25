public class Zi {
    private String nume;
    private boolean isLucratoare;

    public Zi(String nume, boolean lucratoare) {
        this.nume = nume;
        this.isLucratoare = lucratoare;
    }
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public boolean isLucratoare() {
        return isLucratoare;
    }
    public void setLucratoare(boolean lucratoare) {
        isLucratoare = lucratoare;
    }

}
