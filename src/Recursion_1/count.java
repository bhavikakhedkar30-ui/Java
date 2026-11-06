package Recursion_1;

public class count {

    public static void counting(int n){
        if(n == 11) return;
        System.out.println(n);
        counting(n+1);
    }
    static void main(String[] args) {
        counting(1);
    }
}
