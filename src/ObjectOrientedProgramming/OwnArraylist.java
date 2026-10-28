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
        if(idx == arr.length){
            int [] newarr = new int[arr.length*2];
           for( int i = 0; i < arr.length; i++){ // copy paste
               newarr[i] = arr[i];
           }
           arr = newarr;
        }
        arr[idx++]=ele;
        size++;
    }
    int capacity(){
        return arr.length;
    }

    void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class OwnArraylist {
    static void main(String[] args) {
        arraylist arr = new arraylist(8);
        arr.add(10);
        arr.add(20);
        arr.add(30);

        arr.display();

    }
}
