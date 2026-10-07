package Arrays_2D;

public class rowwithmaxsum {
    public static void main(String[] args) {
        int [][] arr = {{3,4,6},{2,6,8},{10,11,12}};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            max = Math.max(sum, max);

        }
        System.out.print(max);
    }
}
