import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
       sum();
        

    }

    static void sum (){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = in.nextInt();
        System.out.println( num1 + " + " + num2 + " = " + (num1+num2));
        


    }
}

