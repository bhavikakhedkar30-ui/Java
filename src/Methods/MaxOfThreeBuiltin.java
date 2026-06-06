package Methods;

import java.util.Scanner;

public class MaxOfThreeBuiltin {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter 3 numbers to find the max:  ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max2= Math.max(a,b);
        int result = Math.max(c,max2);
        System.out.println(result);
    }
}
