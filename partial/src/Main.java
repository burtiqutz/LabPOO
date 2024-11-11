import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1    am comentat codul pentru ca era enervant la testat
//        System.out.println("Dati nr preparate:");
//        Scanner input = new Scanner(System.in);
//        int nrPreparate = input.nextInt();
//        System.out.println("nr preparate este: " + nrPreparate);

        // 2&3
        Pizza pizza1 = new Pizza(35, "Prosciutto");
        Pizza pizza2 = new Pizza(26, "Margherita");
        Desert desert1 = new Desert(20, "Lava cake");
        Desert desert2 = new Desert(17, "Clatite");
        Racoritoare racoritoare1 = new Racoritoare(10, "Cola");
        Racoritoare racoritoare2 = new Racoritoare(15, "Fresh");


        Comanda comanda1 = new Comanda();   // default 10 preparate max
        Comanda comanda2 = new Comanda(2);  // 2 preparate max
        /// in mod normal aici as da nrPreparate citit la tastatura, dar pentru teste am dat eu o valoare
        Restaurant grande = new Restaurant(6, 10);
        grande.addToMenu(pizza1);
        grande.addToMenu(pizza2);
        grande.addToMenu(desert1);
        grande.addToMenu(desert2);
        grande.addToMenu(racoritoare1);
        grande.addToMenu(racoritoare2);

        grande.showMenu();
        System.out.println("----------------------------");
        comanda1.addPreparat(pizza1, grande);
        comanda1.addPreparat(pizza2, grande);
        comanda1.addPreparat(desert1, grande);
        comanda1.addPreparat(racoritoare1, grande);
        comanda2.addPreparat(desert2, grande);
        comanda2.addPreparat(racoritoare2, grande);

        comanda1.showComanda();
        comanda2.showComanda();
        System.out.println("----------------------------");
        grande.addComanda(comanda1);
        grande.addComanda(comanda2);


        Client client1 = new Client("Dani Pop", 3);
        client1.addComanda(comanda1);
        client1.addComanda(comanda2);
        Client client2 = new Client("Ion Ionescu", 0);
        //System.out.println(client1.getTotalPriceComenzi());
        System.out.println(client1);
        System.out.println(client2);
        System.out.println("----------------------------");

        grande.setStatusComanda(0, 1);
        grande.setStatusComanda(1, 1);
        grande.showNotDelivered();

        grande.setStatusComanda(0, 2);
        grande.showNotDelivered();
    }
}