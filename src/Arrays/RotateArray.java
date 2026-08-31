package Arrays;

import java.util.Scanner;

public class RotateArray {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n =  arr.length;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Expected Number of Rotation: ");
        int d = in.nextInt();
        d = d%n;
        rev(arr,0,d-1);
        rev(arr,d,n-1);
        rev(arr,0,n-1);
        System.out.println("Expected Rotation: "+ d);
        System.out.print("Resultant Array:-  ");
        for(int j=0;j<n;j++){
            System.out.print((arr[j])+" ");
        }
    }
    static void rev(int[] arr,int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
}
