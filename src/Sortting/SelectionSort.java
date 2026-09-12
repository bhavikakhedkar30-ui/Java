package Sortting;

public class SelectionSort {
    static void main(String[] args) {
        int[] arr = {5, 1, -3, 6, 8, 4, 9};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int smallest = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }

        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
