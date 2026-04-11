public class BoundaryInner {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9,10,11,12},
            {13,14,15,16}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        
        System.out.println("Boundary Elements:");

        
        for (int j = 0; j < cols; j++) {
            System.out.print(arr[0][j] + " ");
        }

       
        for (int i = 1; i < rows; i++) {
            System.out.print(arr[i][cols - 1] + " ");
        }

        
        for (int j = cols - 2; j >= 0; j--) {
            System.out.print(arr[rows - 1][j] + " ");
        }

       
        for (int i = rows - 2; i > 0; i--) {
            System.out.print(arr[i][0] + " ");
        }

        
        System.out.println("\nInner Elements:");

        for (int i = 1; i < rows - 1; i++) {
            for (int j = 1; j < cols - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
