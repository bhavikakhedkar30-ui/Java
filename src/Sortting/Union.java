package Sortting;

public class Union {
    static void main() {
        int[] a = {1,2,2,3,6};
        int[] b = {1,2,3,4,6,8};
        int[] c = {};
        int l = 0;
        for(int i=0;i<a.length;i++) {
            c[l] = a[i];
        }
        for(int i=0;i<c.length;i++) {
            System.out.print(c[i]);
        }
    }
}
