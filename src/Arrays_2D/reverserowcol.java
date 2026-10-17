package Arrays_2D;

public class reverserowcol {
    static void main(String[] args) {
        int[][] arr =  {{3,4,6},{2,6,8},{10,11,12}};
        for (int row = arr.length - 1; row >= 0; row--) {
            for (int col = arr[row].length - 1; col >= 0; col--) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
