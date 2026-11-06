package Recursion_1;

import java.util.Scanner;

public class forwardcounting {
    public static void forward(int n , int m){
        if (n==m)return;
        System.out.println(n);
        forward(n+1,m);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter start number n : ");
        int n = input.nextInt();
        System.out.println("Enter end number m : ");
        int m = input.nextInt();
        forward(n,m);
    }
}
