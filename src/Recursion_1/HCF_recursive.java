package Recursion_1;

import java.util.Scanner;

public class HCF_recursive {
    public static int hcf(int a, int b) {
        if (b == 0) return a;
        return hcf(b, a % b);
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(hcf(a, b));
    }
}
