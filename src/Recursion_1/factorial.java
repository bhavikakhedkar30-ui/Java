package Recursion_1;

public class factorial {
    public static int fact(int n) {
        if(n == 0) return 1 ;
        return n * fact(n-1);
    }

    static void main(String[] args) {
        System.out.println(fact(5));
    }
}
