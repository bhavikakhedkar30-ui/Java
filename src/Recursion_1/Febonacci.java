package Recursion_1;

public class Febonacci {
    static int fib(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
    static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println(fib(10));

    }
}
