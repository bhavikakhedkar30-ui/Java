//HOMEWORK:
package Pattern_Printing;

public class Triangle4 {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 5 ; i ++){
            for (int j = 1 ; j <= i ; j++){
             if (i % 2 == 1) System.out.print(j + " ");
             else System.out.print((char)('A' + j - 1)+ " ");
            }
            System.out.println();
        }
    }

    }
