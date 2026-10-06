package Arrays_2D;
//output , creation of 2-D array
public class creation {
    static void main(String[] args) {
           // int [][] arr = new int[3][4];
        int [][] arr = {{3,4,6},{2,6,8},{10,11,12}};
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
