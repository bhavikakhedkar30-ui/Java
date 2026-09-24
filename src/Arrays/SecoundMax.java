package Arrays;

public class SecoundMax {
    static void main(String[] args) {
        int[] arr = {19,13,7,8,12};
        int max = arr[0];
        int smax = Integer.MIN_VALUE;
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