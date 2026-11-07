package Recursion_1;

public class homework1 {
    public static void counting(int n)
    {
        if(n == 0) return;
        System.out.print(n+ " ");
        counting(n-1);
        System.out.print(n+ " ");




    }
    public static void main(String[] args) {
        counting(5);
    }
}
