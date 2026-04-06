import java.util.Arrays;

public class Swap2 {

    public static void main(String[] args) {

        Swap();
        
    }

    static void Swap(){

        int arr [] ={1,3,23,9,18};

        int temp = arr[1];
        arr[1] = arr[3];
        arr[3]=temp;

        
            System.out.print(Arrays.toString(arr));
        

    }

}