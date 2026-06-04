//HOMEWORK :-
package If_Else;

import java.util.Scanner;

public class DivisibilityBy5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if(num%5 == 0){
            System.out.println("Number is divisible by 5");
        }

        else{
            System.out.println("Number cant be divided by 5");
        }
    }
}

