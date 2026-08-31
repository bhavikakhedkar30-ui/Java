package Trail;

public class demo {

    static void main() {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            Swap(arr, s, e);
            s++;
            e--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
