package Arrays;

import java.util.Scanner;

public class OutputInputArray {
    static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
//            int [] arr = {5,-2,4,98,56,78,90,76,65,354,58,948};
//        System.out.println(arr.length);
//      int n = arr.length;
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]+ " , ");
//        }        Default value : -
                int [] bhavika = new int[10];
                // Input value :-
         for(int i=0;i<bhavika.length;i++){
             int x = sc.nextInt();
             System.out.print(bhavika[i]+" "+x);
         }





    }
}
