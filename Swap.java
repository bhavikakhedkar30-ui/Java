public class Swap {
    public static void main(String[] args) {
        swap();
    }
    public static void swap(){
            int a =10;
            int b = 20 ;

            int temp ;

            temp = a;
            a=b;
            b = temp;
            System.out.println("Value of A : "+ a + " Value of b: "+ b );
    }
}
