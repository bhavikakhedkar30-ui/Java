//HOMEWORK 1 :-
package Basics;

import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double for1 = 1.33 , pi = 3.14 ;
        System.out.println("Enter Radius of Sphere: ");
        double radius = in.nextDouble();

        double volume = for1*pi*radius*radius*radius;
        System.out.println("Volume of sphere is: "+volume);

    }
}
