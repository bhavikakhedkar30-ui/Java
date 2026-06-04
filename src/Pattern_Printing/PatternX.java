package Pattern_Printing;

import java.util.Scanner;

public class PatternX {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // int a = 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j || i + j == n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}
