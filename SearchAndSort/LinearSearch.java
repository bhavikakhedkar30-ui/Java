import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch{

             public static void main(String[] args) {
             int arr[] = {18,12,9,14,77,50};
             Scanner in = new Scanner(System.in);
             int key = in.nextInt();

            for(int i = 0 ; i < arr.length ; i ++){
                        if (key == arr[i]){
                            System.out.println("Key found at index: " + i );
                            System.out.println(Arrays.toString(arr));
                        }
                        
                        
             }
            }


}
