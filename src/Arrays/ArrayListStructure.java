package Arrays;
import java.util.ArrayList;
public class ArrayListStructure {
    static void main(String[] args) {
        ArrayList <Integer>  arr = new ArrayList<>();

        //adding number in an arraylist
        arr.add(25);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70);
        arr.add(80);


        //accessing an element feom an arraylist
        System.out.println(arr.get(5));

        //to replace an element in an arraylist with another on a specifc index: -
        arr.set(3,60); // in terms of array :- arr[3] = 60;

    }

}
