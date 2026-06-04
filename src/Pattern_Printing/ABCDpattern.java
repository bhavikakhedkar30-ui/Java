package Pattern_Printing;

import java.util.Scanner;

public class ABCDpattern {
    public static void main(String[] args) {
        int n ; // row , column //
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = in.nextInt(); // Taking both as user input //
        for ( int i = 1; i <= n; i++) {
            for ( int j  = 1; j <= n ; j++) {
                System.out.print((char) (j+64)+ "  ");
            }
            System.out.println();

        }
    }
}
