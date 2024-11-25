public class g {
    private String nume;
    private int ani;

    public g(String nume, int ani) {
        this.nume = nume;
        this.ani = ani;
    }
    public String getNume() {
        if(nume.equals("abc"))
            throw new ExceptieFG("Exceptie trimisa din g");
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public int getAni() {
        return ani;
    }
    public void setAni(int ani) {
        this.ani = ani;
    }

}
