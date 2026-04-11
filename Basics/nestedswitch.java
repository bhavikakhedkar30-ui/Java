import java.util.Scanner;

public class nestedswitch
{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
    int empID = in.nextInt();
    String department = in.next();

    switch(empID){
        case 1: 
                System.out.println("Bhavika Vijay Khedkar");
                break;

        case 2: 
                System.out.println("Yashashvi Verma");
                break;
        
        case 3: 
        switch(department){
            case "IT":
                System.out.println("IT department");

            case "Managment":
                System.out.println("Managment");

            case "Marketing":
                System.out.println("Marketing department");

        }

    }
    }
    
    
}
