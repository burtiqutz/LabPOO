public class Lucrator {
    private String nume;
    CalendarLucru calendar;

    public Lucrator(String nume, CalendarLucru calendar) {
        this.nume = nume;
        this.calendar = calendar;
    }

    public String getNume() {
        return nume;
    }

    public CalendarLucru getCalendar() {
        return calendar;
    }

    public void lucreaza(String zi) throws ExceptieZiLucratoare {
        Zi ziuaDeLucru = calendar.getZi(zi);
        if (ziuaDeLucru.isLucratoare()) {
            System.out.println(this.nume + " lucreaza in ziua de " + ziuaDeLucru.getNume());
        } else {
            throw new ExceptieZiLucratoare("Ziua " + ziuaDeLucru.getNume() + " este nelucratoare");
        }
    }
}
