package Recursion_1;

public class sumofsubset {
    public static void sum(int[] arr , int idx , int ans){
        if(idx==arr.length){
            System.out.println(ans);
            return;
        }
        sum(arr,idx+1,ans);
        sum(arr,idx+1,ans+arr[idx]);

    }
    static void main(String[] args) {
        int[] arr = {2,3};
        sum(arr,0,0);
    }
}
