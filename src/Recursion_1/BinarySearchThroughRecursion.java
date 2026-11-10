package Recursion_1;

public class BinarySearchThroughRecursion {
    public static int binary(int[] arr, int low, int high, int k ){
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (k == arr[mid]) return mid;

        if (k > arr[mid]) {
            return binary(arr, mid + 1, high, k);
        }

        return binary(arr, low, mid - 1, k);
    }
    static void main(String[] args) {
        int[] arr = {3, 7, 12, 18, 24, 29, 35, 41, 48, 56, 63, 71, 85, 92};

        int low = 0;
        int high = arr.length - 1;
        int k = 41;

        int result = binary(arr, low, high, k);

        System.out.println(result);
    }
}
