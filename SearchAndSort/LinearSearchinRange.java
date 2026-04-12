import java.util.Scanner;

public class LinearSearchinRange {
    public static void main(String[] args) {
        int [] arr = {12,-4,5,78,98,-6};
        System.out.println("Enter num: ");
        Scanner in = new Scanner(System.in);
        int key = in.nextInt();

        //Searching in a certain ramge provided to us// suppose search 5 in 
        // the range of 1 to 5 

        for(int i = 1; i < arr[4]; i++){
            if(key == arr[i]){
                System.out.println("key found on index: "+ i);
            }
        }

    }
}
