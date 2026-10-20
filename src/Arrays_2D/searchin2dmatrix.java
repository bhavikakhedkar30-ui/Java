package Arrays_2D;

public class searchin2dmatrix {
    static void main(String[] args) {
        int target = 3;
        int [][] arr =  {{8,3,6},{2,6,8},{10,11,12}};
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                if (arr[i][j] == target) {
                    flag = true;
                    break;
                }
                else {
                    flag = false;
                }
            }
        }
        System.out.println(flag);
    }
}
