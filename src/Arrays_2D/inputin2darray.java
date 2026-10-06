package Arrays_2D;

import java.util.Scanner;

public class inputin2darray {
    static void main(String[] args) {
        int [][] arr = new int [3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements of 2D array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Entered elements of 2D array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
