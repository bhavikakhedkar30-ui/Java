package Sortting;

public class MoveZerolast {
    static void main(String[] args) {
        int[] arr = {0, -2, 6, 5, 2, 0, 7, 2};
        int n = arr.length;
        for (int j = 0; j < n-1; j++) {
            for (int i = 0; i < n - 1-j; i++) {
                if (arr[i] == 0 && arr[i + 1] != 0 || arr[i] == 0 && arr[i + 1] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
