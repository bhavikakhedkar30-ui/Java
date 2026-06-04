package Basics;

import java.util.Scanner;

public class TSAOfCuboid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Length: ");
        double l = in.nextDouble();
        System.out.println("Enter Breadth: ");
        double b = in.nextDouble();
        System.out.println("Enter height: ");
        double h = in.nextDouble();

        double TSA = 2*l*b+b*h+h*l;
        System.out.println("TSA for Length: "+ l + " breadth: " + b + " height: " + h + " is :- "+ TSA );
    }
}