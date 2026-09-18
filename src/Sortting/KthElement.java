package Sortting;
import java.util.Arrays;

public class KthElement {
    static void main(String[] args) {
        int[] arr = {10, 5, 4, 3, 48, 2, 33, 53, 10}; // 3,4,5,10
        int k = 4;
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Kth element is " + arr[kth-1]);

      //  int n = arr.length;
        //smallest gets incremented and changed with i
        for (int i = 0; i < arr.length - 1; i++) {

            int smallest = i;
            // Actually finding the smallest
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            // swapping smallest and i'th element
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        // Traversal and printing
        for (int l = 0; l < arr.length; l++) {
            System.out.print(arr[l] + " ");
        }

        System.out.println("Smallest element is " + arr[k-1]);
    }
}
