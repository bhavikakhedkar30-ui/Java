package Sortting;
import java.util.Arrays;

public class TwoSum {
    static void main(String[] args) {
        int [] arr = {-3,1,8,4,8,7};
        int target = 9;
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            if(arr[i]+arr[j]==target){

            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println("Target number is "+target);
    }
}
