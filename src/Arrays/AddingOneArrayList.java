package Arrays;

import java.util.ArrayList;

public class AddingOneArrayList {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(9);
        list.add(9);

        int i = list.size() - 1;

        while (i >= 0 && list.get(i) == 9) {
            list.set(i, 0);
            i--;
        }

        if (i >= 0) {
            list.set(i, list.get(i) + 1);
        } else {
            list.add(0, 1);
        }

        System.out.println(list);


    }
}
