package Pattern_Printing;

public class NumberTriangle {
    static void main() {
        int n=4;
        int a=1;
        for(int i = 1 ; i<= n ; i++){
            for(int j = 1 ; j<= i ; j++){
                    System.out.print(a+" ");
                    a++;
            }
            System.out.println();
        }
    }
}
