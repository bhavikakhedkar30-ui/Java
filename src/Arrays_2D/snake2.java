package Arrays_2D;

public class snake2 {
    static void main(String[] args) {
        int[][] arr =  {{3,4,6},{2,6,8},{10,11,12}};
        for (int col = 0; col < arr[0].length; col++) {
            if (col % 2 == 0) {
                // Top to bottom
                for (int row = 0; row < arr.length; row++) {
                    System.out.print(arr[row][col] + " ");
                }
            } else {
                // Bottom to top
                for (int row = arr.length - 1; row >= 0; row--) {
                    System.out.print(arr[row][col] + " ");
                }
            }
        }
    }
}
