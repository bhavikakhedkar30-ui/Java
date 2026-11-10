package Recursion_1;

public class exsits {
    public static boolean find(int[]arr,int idx ,int ele){
        if(idx==arr.length){
            return false;
        }
        if (arr[idx] == ele){
            return true;
        }
        return  find(arr,idx+1,ele);

    }
    static void main(String[] args) {

        int [] arr = {12,45,66,65,89,90,23};
        rec(arr, 0);
        System.out.println(find(arr,0,arr.length-1));


    }

    public static void rec(int[] arr , int idx){
        int n = arr.length;
        if (idx == n ) return ;

        rec(arr,idx+1);
        System.out.print(arr[idx]+" ");
    }
}
