package Recursion_1;
//how does exactly function calling works
public class InfiniteLoop {

    public static void bhavika(){
        System.out.println("im");
        anshika();
    }
    public static void anshika(){
        System.out.println("doing");
        bhoomi();
    }
    public static void bhoomi(){
        System.out.println("good");
        bhavika();
    }

    static void main(String[] args) {
        bhavika();
    }
}
