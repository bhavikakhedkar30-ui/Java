package Recursion_1;

import java.util.Scanner;

public class callback {

    public static void call(int n){
        if(n == 0) return;
        call(n-1);
        System.out.println(n);

    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        call(n);
    }
}
