package ObjectOrientedProgramming;
class students{
    String name;
    private int rollno = 96;
    double cgpa;

    private void print(){
        System.out.println(rollno);
    }
}

public class privatekeyword {

    static void main(String[] args) {
        students s1 = new students();
        s1.name ="jack";
        System.out.println(s1.name);
        //s1.print();
    }
}
