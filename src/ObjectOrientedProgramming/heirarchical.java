package ObjectOrientedProgramming;
import java.util.Scanner;

class SeaCreatures {


    int gills;
    void sound() {

        System.out.println("they don't make sound");
    }
}
class fish extends SeaCreatures {
    String habitat = "Pond";

}
class whale extends SeaCreatures {
    String habitat = "deep ocean";
}
public interface heirarchical {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        whale w = new whale();
        w.sound();
        System.out.println("tell number of gills: ");
        w.gills = sc.nextInt();
        System.out.println(w.gills);


    }
}
