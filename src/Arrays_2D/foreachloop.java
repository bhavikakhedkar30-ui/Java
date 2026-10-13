package Arrays_2D;

public class foreachloop {
    static void main(String[] args) {
        int [][] arr = {{3,4,6},{2,6,8},{10,11,12}};
        for (int i = 0; i < arr.length; i++) {
            for (int element : arr[i]) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        //2 for each loop

        for (int [] i : arr) {
            for (int element : i) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
