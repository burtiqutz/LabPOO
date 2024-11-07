public class Ghiozdan {
    private int index = 0;
    Rechizita[] rechizite = new Rechizita[10];

//    public void add(Caiet caiet) {
//        if (index < 10) {
//            rechizite[index++] = caiet;
//        } else {
//            System.out.println("Ghiozdan plin");
//        }
//    }
//
//    public void add(Manual manual) {
//        if (index < 10) {
//            rechizite[index++] = manual;
//        } else {
//            System.out.println("Ghiozdan plin");
//        }
//    }

    public void add(Rechizita r) {
        if(index < 10){
            rechizite[index++] = r;
        }else{
            System.out.println("Ghiozdan plin");
        }
    }

    public void listItem(){
        for(Rechizita r : rechizite){
            if(r != null){
                System.out.println(r.getNume());
            }
        }
    }

    public void listManual(){
        for(Rechizita r : rechizite){
            if(r instanceof Manual){
                if(r != null){
                    System.out.println(r.getNume());
                }
            }
        }
    }

    public void listCaiet(){
        for(Rechizita r : rechizite){
            if(r instanceof Caiet){
                if(r != null){
                    System.out.println(r.getNume());
                }
            }
        }
    }

    public int getNrRechizite(){
        return index;
    }

    public int getNrManual(){
        int count = 0;
        for(Rechizita r : rechizite){
            if(r instanceof Manual){
                count++;
            }
        }
        return count;
    }

    public int getNrCaiete(){
        int count = 0;
        for(Rechizita r : rechizite){
            if(r instanceof Caiet){
                count++;
            }
        }
        return count;
    }
}