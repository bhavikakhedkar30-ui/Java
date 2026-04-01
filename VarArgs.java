import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,5,9,3,85,2);
        multiple(2, 3,"bhavika");
    }
    static void multiple(int a , int b ,  String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
