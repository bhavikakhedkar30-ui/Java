package Arrays;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int x[] = {10,45,54,55,56};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
        for(int i = 0;i<x.length;i++) {
            System.out.print(x[i]+ " ");
        }
    }
    public static void change(int[] a){

        a [2]= 20;
    }
}
