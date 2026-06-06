package Pattern_Printing;

import java.util.Scanner;

public class RightIsotriangle {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1 ; i<=n ;i++){
            for(int j=1 ; j<=n ;j++){
                if((i+j)>n) System.out.print("* ");
                else System.out.print("  ");

            }
            System.out.println();
        }
    }
}
