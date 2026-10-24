package ObjectOrientedProgramming;

import Arrays_2D.sum;

public class constructor {
    public static class car {
        int seats; // by default -> 0
        String name; // by default -> null
        double length; //by default ->0.0
        String type;//by default -> null
        int torque;//by default -> 0
        int price;//by default ->0.0

        car(){ //default constructor

        }

        car(int x , String y){
            price = x;
            name = y;
            //length = z;
        }
        void print(){
            System.out.println(price+" "+name);
        }


    }

    public static int sum (int a, int b){
        return a+b;
    }
    static void main(String[] args) {
        car c1 = new car(124000,"SUV");
        c1.print();
        car c2 = new car(500000,"sports");
        c2.print();

        car c3 = new car();
       // c3.print();




    }
}
