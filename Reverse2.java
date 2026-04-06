import java.util.Arrays;

public class Reverse2 {
    public static void main(String[] args) {
        int arr[] = {1, 3, 23, 9, 18};
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }

        System.out.println(Arrays.toString(arr));
    }
}