package Recursion_1;

public class RecursionOnArray {
    public static void rec(int[]arr , int idx ) {
        int n = arr.length;
        if (idx == n ) return ;

        rec(arr,idx+1);
        System.out.print(arr[idx]+" ");
    }
    static void main(String[] args) {

        int [] arr = {12,45,66,65,89,90,23};
        rec(arr, 0);


    }
}
