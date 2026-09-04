package Arrays;
import java.util.Arrays;

public class ReverseArray {
    static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int s = arr[0];
        int n = arr.length;
        int e = arr[n - 1];
        for (int i = 0; i < n; i++) {
            while (s < e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
            

        }
    }
}

