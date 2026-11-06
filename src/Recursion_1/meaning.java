package Recursion_1;
// how does exactly it works
public class meaning {
    public static void bhavika(int n){
        if (n==10){return;}
        System.out.print("bhavika");
        bhavika(n+1);
    }
    static void main(String[] args) {
        bhavika(0);
    }
}
