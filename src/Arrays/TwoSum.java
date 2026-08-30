package Arrays;

public class TwoSum {
    static void main(String[] args) {
        int traget = 2;
        int[] arr = {1,5,-3,8,9};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == traget) {
                    System.out.println(arr[i] + " + " + (arr[j]) + " is " + traget);
                }
            }

        }
    }
}
