package Binary_Search;

public class searchinrotatedandsortedarray {
    static void main(String[] args) {
        int[] arr ={7,8,9,10,1,2,3};
        int key = 3;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                System.out.print(mid);
            }

            // Left half is sorted
            if (arr[low] <= arr[mid]) {

                // Is key inside the sorted left half?
                if (key >= arr[low] && key < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }

            }
            // Right half is sorted
            else {

                // Is key inside the sorted right half?
                if (key > arr[mid] && key <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        System.out.println("-1");
    }
}
