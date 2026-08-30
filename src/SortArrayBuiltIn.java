import java.util.Arrays;
public class SortArrayBuiltIn {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,-50,60,-70,8,900,10};
        print(arr);
        Arrays.sort(arr);
        print(arr);


    }
    public static void print(int [] x){
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");

        }
        System.out.println();
    }
}
