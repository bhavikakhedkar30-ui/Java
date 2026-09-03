package TimeAndSpaceComplexity;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4};
        int n  = arr.length-1;
        int sum = 0;
        //APPROACH 1: BRUTE FORCE
        /*for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate number: " + arr[i]);
                }
            }
        }*/

        //APPROACH 2: MARKING
       /*  Boolean[] Flag = new Boolean[n+1];
        for (int i = 0; i < n; i++) {
            int element = arr[i];
           if(Flag[element] == true){
                System.out.println("Duplicate number"+element);
            }
            else
            {
                Flag[element] = true;
            }
        }*/

        //APPROACH 3: Most Optimized
        for (int i = 0; i < n; i++) {

            sum = sum+arr[i];
        }
        int miss = n * (n+1)/2;
       // System.out.println(miss);
        System.out.println("Duplicate Number:  "+(sum-miss));

    }
}