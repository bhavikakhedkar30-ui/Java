package Arrays;
import java.util.ArrayList;
import java.util.Collections;

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
       // arr.remove(6);

        //accessing an element from an arraylist
        //System.out.println(arr.get(5));

        //to replace an element in an arraylist with another on a specific index: -
        arr.set(3,60); // in terms of array :- arr[3] = 60;

        //Method 1 :- print the whole arrayList
            //  System.out.println(arr);

        //Method 2 :- print the whole arrayList
        for(int i = 0; i < arr.size(); i++){
            //System.out.print(arr.get(i)+ " ");
        }

        //Method 3:- Print the whole arrayList
        for(int ele :arr){
          //  System.out.print(ele+" , ");
        }

        //REVERSE ARRAYLIST//

        Collections.reverse(arr);
        System.out.println(arr);


    }

}
