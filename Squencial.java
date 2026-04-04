import java.util.Scanner;

public class Squencial {

    public static void Search(int key){

        int [] arr = {20,54,63,89,54,65,8};
        for (int i =0 ; i < arr.length ; i++ ){
            if (key == arr[i]){
                System.out.println(arr[i] + " Found At Index : " + i);
            }
            
        }
        

    

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value you want search: ");
        int key = in.nextInt();
        Search(key);

        
    }
}
