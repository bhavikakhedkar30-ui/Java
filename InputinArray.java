import java.util.Scanner;

public class InputinArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int [5];
        // arr[0] = 45;
        // arr[1] = 45;
        // arr[2] = 45;
        // System.out.print("[ " + " " + arr[0]);
        //  System.out.print( " , " +arr[1]);
        //   System.out.print( " , " +arr[2]+ " ]");

          // Using loops for inputs -- 

          for(int i = 0 ; i <= arr.length ; i++){
                arr [i] = in.nextInt();
          }
          

    }
}
