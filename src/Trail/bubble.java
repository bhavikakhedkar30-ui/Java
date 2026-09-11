package  Trail;
public class bubble {

    public static void main(String[] args) {

        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) { //n-1 = last index
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}