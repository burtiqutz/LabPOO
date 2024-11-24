public class Persoana implements Comparable{
    private String nume;
    private String prenume;
    private int varsta;

    public Persoana (){
        this.nume = "";
        this.prenume = "";
        this.varsta = 0;
    }

    public Persoana(String nume, String prenume, int varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public int compareTo(Object o) {
        Persoana persoana = (Persoana) o;
       // return this.nume.compareTo(persoana.nume);
        return this.varsta - persoana.varsta;
    }


    @Override
    public String toString() {
        return this.nume + " " + this.prenume + " " + this.varsta;
    }
}
