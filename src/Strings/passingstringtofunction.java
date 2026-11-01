package Strings;
//nhi hoga change string is immutable
public class passingstringtofunction {

    public static void change(String x){
            x = "khedkar";
    }
    public static void main(String[] args) {
        String x = "bhavika";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
