package If_Else;

import java.util.Scanner;

public class fourdigitNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = in.nextInt();

        if(n > 999 && n < 10000){

            System.out.println("Number is four digit");

        }
    }
}
