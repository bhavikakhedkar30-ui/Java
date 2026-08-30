package Arrays;
import java.util.Arrays;
// multiply odd index with 2 and add 10 to even indexed element
public class que {
    static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                arr[i]=arr[i]+10;
            }
            else{
                arr[i]=arr[i]*2;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
