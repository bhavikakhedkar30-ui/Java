package Sortting;

public class optimizedBubble {
    static void main() {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean issorted = true;
            for(int k= 0 ; k < n-1; k++){
                if (arr[k] > arr[k+1]) {
                    issorted = false;
                    break;
                }
            }
            if (issorted == true) {
                break;
            }
            for (int j = 0; j < n-1-i ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ " ");
        }
    }
}
