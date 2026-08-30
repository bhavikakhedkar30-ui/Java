package Arrays;

import java.util.Scanner;

public class LinearSearch {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of the element you want to search: ");
        int key = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                System.out.println("Element Found");
                return;
            }

        }
        System.out.println("Element Not Found");


    }
}
