package Recursion_1;

//import static Strings.passingstringtofunction.change;

import java.util.ArrayList;

public class StringsBasicsMore {
    static void main(String[] args) {
//        String s = "bhavika";
//        change(s);
//        System.out.println(s);

//        String [] arr = {"krish","gopi","bhavika","bhoomi","hemant"};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }

        ArrayList<String> al = new ArrayList<>();
        al.add("krish");
        al.add("gopi");
        al.add("bhavika");
        al.add("hemant");
        al.add("krish");
        System.out.println(al);
        change(al);
        System.out.println(al);
    }
    private static void change( ArrayList<String> al) {
         al.add("crazy");
    }
}
