public class Main {
    public static void main(String[] args) {
        try{
            CalendarLucru c1 = new CalendarLucru();
            Lucrator l1 = new Lucrator("Lasconi", c1);
            l1.lucreaza("luni");
            l1.lucreaza("sambata");
        }catch (ExceptieZiLucratoare e){
            System.out.println(e.getMessage());
        }
        try{
            CalendarLucru c1 = new CalendarLucru();
            Lucrator l1 = new Lucrator("Lasconi", c1);
            l1.lucreaza("luni");
            l1.lucreaza("marte");
        }catch (ExceptieZiLucratoare e){
            System.out.println(e.getMessage());
        }

        //  Null ptr exception
        try{
            Zi zi = null;
            zi.getNume();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        try{
            Zi[] asdf = new Zi[10];
            System.out.println(asdf[12].getNume());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            throw new Exception("georgescu nu era ala cu papuci?");
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("merge mereu ca e finally");
        }

        try{
            g testG = new g("abc", 21);
            f testF = new f(testG);
            testF.apeleazaG();
        } catch (ExceptieNoua e){
            System.out.println(e.getMessage());
        }
    }
}
