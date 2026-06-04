package If_Else;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        /*if(num >= 0)
        {
            System.out.println(num);
        }
        else{
            System.out.println(num*-1);
        }*/

        if(num<0) num = -num;
        System.out.println(num);

    }
}
