package ObjectOrientedProgramming;

import java.util.Scanner;

class students{
    String name;
    private int rollno ;
    double cgpa;

//     void print(){
//        System.out.println(rollno);
//    }
    int getRollno(){ // getter
         return rollno;
    }
    void setrollno(int x){
         rollno=x;
    }
//    public void p(){
//        print();
//
//    }
}

public class privatekeyword {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        students s1 = new students();
//        s1.name ="jack";
//        System.out.println(s1.name);
//       // s1.print();
//      //  s1.p();
//        //System.out.println(s1.getRollno());
//        s1.setrollno(450);
//        System.out.println(s1.getRollno());

        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println(sb);


    }
}
