package Pattern_Printing;

import java.util.Scanner;

public class NumberTriangle2 {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" "+" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
