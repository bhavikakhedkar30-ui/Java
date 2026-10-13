package Arrays_2D;

public class snake {
    public static void main(String[] args) {
        int[][] snake =  {{3,4,6},{2,6,8},{10,11,12}};
        for (int i = 0; i < snake.length; i++){
            if(i%2==0){
                for (int j = 0; j < snake[0].length; j++){
                    System.out.print(snake[i][j]+" ");
                }
            }
            else{
                for (int j = snake[0].length-1;j>=0; j--){
                    System.out.print(snake[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
