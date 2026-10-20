package Arrays_2D;
import java.util.ArrayList;

public class Pascaltriangle {
    static void main(String[] args) {
        int numRows = 5;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(ans.get(i - 1).get(j - 1)
                            + ans.get(i - 1).get(j));
                }
            }

            ans.add(row);
        }

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
    }
}
