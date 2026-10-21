package Arrays_2D;

public class sprialprinting3 {
    static void main(String[] args) {


                int[][] arr = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };

                int top = 0;
                int bottom = arr.length - 1;
                int left = 0;
                int right = arr[0].length - 1;

                while (top <= bottom && left <= right) {

                    // 1. Left to right
                    for (int j = left; j <= right; j++) {
                        System.out.print(arr[top][j] + " ");
                    }
                    top++;

                    // 2. Top to bottom
                    for (int i = top; i <= bottom; i++) {
                        System.out.print(arr[i][right] + " ");
                    }
                    right--;

                    // 3. Right to left
                    if (top <= bottom) {
                        for (int j = right; j >= left; j--) {
                            System.out.print(arr[bottom][j] + " ");
                        }
                        bottom--;
                    }

                    // 4. Bottom to top
                    if (left <= right) {
                        for (int i = bottom; i >= top; i--) {
                            System.out.print(arr[i][left] + " ");
                        }
                        left++;
                    }
                }
            }
        }


