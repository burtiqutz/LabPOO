public class CalendarLucru {
    private Zi[] saptamana = new Zi[7];

    public CalendarLucru() {
        saptamana[0] = new Zi("luni", true);
        saptamana[1] = new Zi("marti", true);
        saptamana[2] = new Zi("miercuri", true);
        saptamana[3] = new Zi("joi", true);
        saptamana[4] = new Zi("vineri", true);
        saptamana[5] = new Zi("sambata", false);
        saptamana[6] = new Zi("duminica", false);
    }

    public Zi[] getSaptamana() {
        return saptamana;
    }

    public Zi getZi(String nume) throws ExceptieZiLucratoare {
        for(Zi zi : saptamana){
            if(zi.getNume().equals(nume)){
                return zi;
            }
        }
        throw new ExceptieZiLucratoare("Ziua nu exista in calendar");
    }
}
