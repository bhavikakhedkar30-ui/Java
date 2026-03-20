import java.util.Scanner;

public class Input {
    public static void main(String args[]){
        // System.out.println("Enter your rollnumber: ");
         Scanner input = new Scanner(System.in);
        // int rollnumber = input.nextInt();
        // System.out.println("Your rollnumner is: "+rollnumber);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Name Recieved In System: "+name);
    }
    
}
