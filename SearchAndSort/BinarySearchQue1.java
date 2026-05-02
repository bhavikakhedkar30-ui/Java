public class BinarySearchQue1 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 16;

        int str = 0;
        int end = arr.length - 1;

        while (str <= end) {
            int mid = str + (end - str) / 2;

            if (arr[mid] < target) {
                str = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                System.out.println("Element found at index: " + mid);
                return;
            }
        }

        System.out.println("Element not found");
    }
}