package ObjectOrientedProgramming;

import Arrays_2D.sum;

public class constructor {
    public static class car {
        int seats; // by deafult -> 0
        String name; // by deafult -> null
        double length; //by deafult ->0.0
        String type;//by deafult -> null
        int torque;//by deafult -> 0
        double price;//by deafult ->0.0

        car(){ //default constructor

        }

        car(int x , String y,double z){
            seats = x;
            name = y;
            length = z;
        }
        void print(){
            System.out.println(name+" "+seats+" "+length);
        }


    }

    public static int sum (int a, int b){
        return a+b;
    }
    static void main(String[] args) {
//        car c1 = new car(4,"SUV",8.99);
//        c1.print();
//        car c2 = new car(5,"sports",8.99);
//        c2.print();
//
//        car c3 = new car();
//        c3.print();
        System.out.println(sum(3,4));



    }
}
