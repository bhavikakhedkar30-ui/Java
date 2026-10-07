package Arrays_2D;

public class rowwithmaxelement {
    static void main(String[] args) {
        int [][] arr = {{3,4,6},{2,6,8},{10,11,12}};
        int max = arr[0][0];
        int i;
        for ( i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++){
                if(arr[i][j]>max){
                    max = i;
                }
            }

        }
        System.out.print(i);

    }
}
