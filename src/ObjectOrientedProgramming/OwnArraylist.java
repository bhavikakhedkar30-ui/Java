package ObjectOrientedProgramming;

import java.util.ArrayList;

class arraylist{ //this is user defined data structure//
    int [] arr;
    int idx = 0 ;
    int capacity =10;
    int size = 0;
    arraylist(int capacity){
        arr = new int[capacity];
    }



    void add(int ele){

    }
    int capacity(){
        return arr.length;
    }
}
public class OwnArraylist {
    static void main(String[] args) {
        arraylist arr = new arraylist(8);
        System.out.println(arr.capacity());

    }
}
