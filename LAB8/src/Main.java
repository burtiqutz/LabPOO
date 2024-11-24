import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
//        Complex c1 = new Complex(1, 2);
//        Complex c2 = new Complex(3, 4);
//        Fractie f1 = new Fractie(2.5);
//        Fractie f2 = new Fractie(1.5);
//
//        Numeric res = c1.mul(c2);
//        System.out.println(res);
//        res =  c2.mul(f1);
//        System.out.println(res);
//
//        Numeric res2;
//        res2 = f1.mul(f2);
//        System.out.println(res2);
//        res2 = f2.mul(c1);
//        System.out.println(res2);
//
//        Persoana pers1 = new Persoana("Pop", "Andi", 21);
//        Persoana pers2 = new Persoana("Gabi", "Dan", 25);
////        System.out.println(pers1.compareTo(pers2));
//
//        Persoana pers3 = new Persoana("Art", "Mega", 20);
//        Persoana pers4 = new Persoana("Xenia", "Xenia", 25);
//
//        Persoana[] persoane = new Persoana[]{pers1, pers2, pers3, pers4};
//        Arrays.sort(persoane);
//        for(Persoana p : persoane){
//            System.out.println(p);
//        }

        //  tema 3.5
        Masina masina = new Masina("BMW", "rosu");
        Student student = new Student("taxi", "andrei", masina);

        System.out.println(student);
        Student studentShallow = (Student) student.clone();
        System.out.println(studentShallow);
        Student studentDeep = (Student) student.deepClone();
        masina.setColor("verde");
        System.out.println(studentShallow);
        System.out.println(studentDeep);
    }
}
