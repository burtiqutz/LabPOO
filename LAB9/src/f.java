public class f {
    private g test;

    public f(g test) {
        this.test = test;
    }

    public void apeleazaG() throws  ExceptieNoua{
        try {
            test.setNume("abc");
            test.getNume();
        } catch (ExceptieFG e){
            throw new ExceptieNoua("Exceptie aruncata din f " + e.getMessage());
        }
    }
}
