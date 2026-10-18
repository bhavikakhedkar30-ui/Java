package Arrays_2D;

import java.util.ArrayList;

public class Arraylist2D {
    static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(18);
        a.add(26);
        a.add(38);
        a.add(40);
        ArrayList b = new ArrayList();
        b.add(181);
        b.add(216);
        b.add(380);
        b.add(400);
        ArrayList c = new ArrayList();
        c.add(118);
        c.add(226);
        c.add(32);
        c.add(401);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);

        System.out.println(arr);

    }
}
