package ObjectOrientedProgramming;

import java.util.Scanner;

public class userdefineddatatype {
    public static  class student{

        // khudka ek data type bna liya hai -> which is a class
        // taking input



        String name;
        int rollno;
        double cgpa;
        
    }
    static void main(String[] args) {

        // objects of class student
        student s1 =  new student(); // declaration

        Scanner sc = new Scanner(System.in);
       // s1.name = "bhavika";

        System.out.println("enter name: ");
        s1.name = sc.next();
        System.out.println("enter rollno: ");
        s1.rollno = sc.nextInt();
        s1.cgpa = 8.0;

        student s2 =  new student();
        s2.name = "Sam";
        s2.rollno = 91;
      //  System.out.println("before changing "+s2.rollno);
        s2.cgpa = 9;

        student s3 =  new student();
        s3.name = "jane";
        s3.rollno = 90;
        s3.cgpa = 9.3;

        System.out.println("Information of student: "+s1.name);
        System.out.print("Rollno: " + s1.rollno);
        System.out.println("CGPA: " + s1.cgpa);



        s2.rollno= 100;
      //  System.out.println("After changing "+s2.rollno);




    }
}
