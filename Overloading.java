import java.util.Scanner;

public class Overloading {
    public static void main(String[] args) {
        sum(10,20);
        sum(10,10,10);
    }

    static void sum(int a , int b , int c){
        Scanner in = new Scanner(System.in);
         System.out.println("Enter 3 Numbers: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        int sum = a+b+c;
        System.out.println("The sum is : "+sum);
    }
    static void sum(int num1 , int num2){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A Number 1: ");
        num1 = in.nextInt();
        System.out.println("Enter A Number 2: ");
        num2 = in.nextInt();
        int result = num1 + num2;
        System.out.println("The sum of "+ num1 + " And "+ num2 + " Is " + result);
    }
}
