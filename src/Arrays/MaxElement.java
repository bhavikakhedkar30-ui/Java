package Arrays;

public class MaxElement {
    public static void main(String[] args) {
         int [] arr = {6,19,7,69,9,171,5};
         int max = arr[0];
         for (int i = 1; i < arr.length; i++) {
             if (arr[i] > max) {
                 max = arr[i];
             }


         }
        System.out.println(max);
    }
}
