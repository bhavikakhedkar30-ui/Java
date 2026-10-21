package ObjectOrientedProgramming;

public class userdefineddatatype {
    public static  class student{

        // khudka ek data type bna liya hai -> which is a class
        String name;
        int rollno;
        double cgpa;
        
    }
    static void main(String[] args) {

        // objects of class student
        student s1 =  new student(); // declaration
        s1.name = "bhavika";
        s1.rollno = 96;
        s1.cgpa = 8.0;

        student s2 =  new student();
        s2.name = "Sam";
        s2.rollno = 91;
        s2.cgpa = 9;

        student s3 =  new student();
        s3.name = "jane";
        s3.rollno = 90;
        s3.cgpa = 9.3;

        System.out.println(s1.name+" "+s1.rollno+" "+s1.cgpa);




    }
}
