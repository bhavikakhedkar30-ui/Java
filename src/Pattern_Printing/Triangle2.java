package Pattern_Printing;

import java.util.Scanner;

public class Triangle2 {
     public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
       int n =  4 ;// in.nextInt();

        for(int i = 1  ; i <= n; i++) {
            for(int j = 1; j <= n + 1 -i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
