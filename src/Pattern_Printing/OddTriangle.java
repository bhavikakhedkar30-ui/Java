package Pattern_Printing;

import java.util.Scanner;

public class OddTriangle {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        //int a = 1;
        for(int i=0 ; i<=n ;i+= 2){
            for(int j = 1 ; j<= i ; j++){
                if(j%2 != 0){
                    System.out.print(j);
                }

            }
            System.out.println();
        }
    }
}
