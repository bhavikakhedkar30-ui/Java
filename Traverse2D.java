import java.util.Scanner;

public class Traverse2D {
    public static void main(String[] args) {
        int [][] arr = {
                {1,5,10,15},
                {20,25,30,35},
                {40,45,50,55},
                {60,65,70,75}
            };

                int row;
                int col;
                System.out.print("Enter element you wanna search: ");
                Scanner in = new Scanner(System.in);
                int key = in.nextInt();

                for(row = 0; row<arr.length;row++){
                    for(col = 0; col<arr[row].length;col++){
                        //System.out.print(arr[row][col]+ " ");
                     if(key==arr[row][col]){
                        System.out.print("Key found on Row: " + row + " & col: " + col);
                     }
                    }
                    
                    System.out.println();
                }


        
    }
    
}
