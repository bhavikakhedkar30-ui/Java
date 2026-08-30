package Arrays;
import java.util.Arrays;

public class ReverseArray {
    static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int s = 0;
        int e = arr.length - 1;
        while (s < e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }


    }

}

