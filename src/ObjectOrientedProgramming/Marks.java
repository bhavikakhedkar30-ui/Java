package ObjectOrientedProgramming;
import java.util.Arrays;

public class Marks {
    public static class studentdata{
        String name;
        int rollno;
        int[] marks;

        studentdata(int s ){
            marks = new int[s];
        }
        void print(){
            for(int i=0;i<marks.length;i++){
                System.out.print(marks[i]+" ");
            }
        }
    }
    static void main(String[] args) {
        studentdata s1 = new studentdata(5);
        studentdata s2 = new studentdata(2);
        s1.marks[0]=74;
        s1.marks[1]=73;
        s1.marks[2]=72;
        s1.marks[3]=71;
        s1.marks[4]=70;
        System.out.println(Arrays.toString(s1.marks));

    }
}
