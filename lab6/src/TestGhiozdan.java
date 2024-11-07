public class TestGhiozdan {
    public static void main(String[] args) {
        Ghiozdan g = new Ghiozdan();

        Caiet c1 = new Caiet("mate");
        Caiet c2 = new Caiet("fizica");
        Caiet c3 = new Caiet("romana");
        Manual m1 = new Manual("chimie");
        Manual m2 = new Manual("biologie");
        Manual m3 = new Manual("mate");

        g.add(c1);
        g.add(c2);
        g.add(c3);
        g.add(m1);
        g.add(m2);
        g.add(m3);

        System.out.println("Numar total rechizite: " + g.getNrRechizite());
        System.out.println("Numar total caiete: " + g.getNrCaiete());
        System.out.println("Numar total manuale: " + g.getNrManual());

        g.listItem();
        g.listCaiet();
        g.listManual();

    }
}
