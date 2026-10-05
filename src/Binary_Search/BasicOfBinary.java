package Binary_Search;
// TO PERFORM A BINARY SEARCH OPERATION WE NEED A SORTED ARRAY TO WORK WITH //
public class BasicOfBinary {
    static void main(String[] args) {
        int[] arr = {5, 10, 20, 25, 35, 45, 50, 65, 100};
        int k = 65;

        int low = 0;
        int high = arr.length - 1; //last element

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == k) {
                System.out.println("Target "+arr[mid]+" found at index: " + mid);
                break;
            }

            if (k > arr[mid]) {
                low = mid + 1;
            }

            if (k < arr[mid]) {
                high = mid - 1;
            }
        }
    }
}
