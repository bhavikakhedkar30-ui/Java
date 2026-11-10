package Recursion_1;

public class countways {
    public static int ways(int n) {
        if (n==0 || n == 1) return 1;

        return ways(n - 1) + ways(n - 2);
    }
    static void main(String[] args) {

        System.out.println(ways(3));
    }
}
