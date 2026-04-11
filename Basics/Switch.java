import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter a fruit: ");
       String fruit = in.next();

       switch(fruit){
        case "mango" -> System.out.println("King of fruits");
        case "Apple" -> System.out.println("Red colour");
        case "Orange" -> System.out.println("Orange colour");
        case "Grape" -> System.out.println("Green colour");
        default  -> System.out.println("Invalid Fruit , Enter fruit");
       }
    }
    
}
