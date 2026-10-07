package Arrays_2D;

public class sum {
    static void main(String[] args) {
        int [][] arr = {{3,4,6},{2,6,8},{10,11,12}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
