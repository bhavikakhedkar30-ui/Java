package Recursion_1;
import java.util.Scanner;
public class apowerb {

    public static int power(int a, int b) {
        if (b == 0) return 1;
        int half = power(a, b / 2);
        if (b % 2 == 0) {
            return half * half;
        } else {
            return a * half * half;
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base: ");
        int a = sc.nextInt();
        System.out.println("Enter exponent: ");
        int b = sc.nextInt();
        System.out.println(a+" raised to "+b+" is "+power(a,b));

    }
}