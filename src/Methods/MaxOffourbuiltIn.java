package Methods;

import java.util.Scanner;

public class MaxOffourbuiltIn {
    static void main() {
        Scanner input = new Scanner(System.in);
        int x  = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int q = input.nextInt();

//        int max1 = Math.max(x,y);
//        int max2 = Math.max(z,q);
//        int result = Math.max(max1,max2);
//
//        System.out.println(result);
        int max1 = Math.max(x, Math.max(y, z));
        int max2 = Math.max(x,q);
        System.out.println(max2);
    }
}
