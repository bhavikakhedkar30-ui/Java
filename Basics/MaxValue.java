//

import java.util.Scanner;

public class MaxValue{

    public static void main (String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.println("Enter Three Numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max; 
         if (a>b){
            max=a;
        } else {
            max =b;
        }
        if (max>c){
                max=max;
        }else{
           
            max = c;
        }

        System.out.println(max+" <- "+"Is The Largest Number");

    }
    
}
