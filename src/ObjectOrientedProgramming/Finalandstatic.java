package ObjectOrientedProgramming;

class Cricketer{
    static String country = "NZ";


    int runs;
    String name;
    double avg;
}

public class Finalandstatic {
    static void main(String[] args) {
        Cricketer c1 = new Cricketer();

       // System.out.println(c1.country);
        Cricketer c2 = new Cricketer();
        c1.country = "India";
        System.out.println(c2.country);

    }
}
