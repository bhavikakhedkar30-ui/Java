import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter a fruit: ");
       String fruit = in.next();

       switch(fruit){
        case "mango":
            System.out.println("King of fruits");
            break;

        case "Apple":
            System.out.println("A sweet red fruit");
            break;

        case "orange":
            System.out.println("a orange fruit");
            break;
        
        default: 
        System.out.println("Enter a valid fruit: ");

       }
    }
    
}
