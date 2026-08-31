package Arrays;
import java.util.Arrays;


public class Sortzeroandone {
    static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1};

        int zero = 0;

        for (int ele : arr) {
            if (ele == 0) {
                zero++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (i < zero) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    }

