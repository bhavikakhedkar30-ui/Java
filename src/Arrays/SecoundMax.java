package Arrays;

public class SecoundMax {
    static void main(String[] args) {
        int[] arr = {42, 17, 89, 5, 63, 28, 94, 11, 76, 35};
        int max = arr[0];
        int smax = arr[0];
        for (int i = 1; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        for (int i = 1; i<arr.length; i++){
            if (arr[i]>smax && arr[i] != max){
                smax = arr[i];
            }
        }
        System.out.println("Maximum value is " + max);
        System.out.println(" Second Maximum value is " + smax);
    }
}