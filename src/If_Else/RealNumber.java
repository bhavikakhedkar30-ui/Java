package If_Else;

import java.util.Scanner;

public class RealNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = in.nextDouble();
        int x= (int)num; // Typecasting //
        if(num-x > 0){
            System.out.println("Not an Integer");
        }
        else{
            System.out.println("not a integer");
        }
    }
}
