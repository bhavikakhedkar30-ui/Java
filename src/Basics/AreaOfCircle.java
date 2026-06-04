package Basics;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Radius of the circle: ");
        double radius = in.nextDouble();
        double pi = 3.14;
        double area = pi * radius * radius ;
        System.out.println(area);

    }
}
