package Pattern_Printing;

import java.util.Scanner;

public class firstPattern {
    public static void main(String[] args) {
        int r , c ; // row , column //
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows and column: ");
        r = in.nextInt(); // Taking both as user input //
        c = in.nextInt();


        for ( int i = 1; i <= r; i++) {
            for ( int j  = 1; j <= c ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
