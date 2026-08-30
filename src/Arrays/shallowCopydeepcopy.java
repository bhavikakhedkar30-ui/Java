package Arrays;
import java.util.Arrays;

public class shallowCopydeepcopy {
    public static void main(String[] args) {
       int[] arr = {10,20,30,40,50,60};
//        int[] x = arr;
//        x[0] = 1000;
//        System.out.println(arr[0]);
        //deep copy
        int [] deep = Arrays.copyOf(arr,arr.length);
        deep[0]=25;
        System.out.println(Arrays.toString(deep) );
        System.out.println(Arrays.toString(arr));


    }
}
