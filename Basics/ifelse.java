import java.util.Scanner;

public class ifelse {

        public static void main (String args[]){

            //int salary;
            Scanner input = new Scanner (System.in);
            System.out.print("Enter your salary: ");
            int salary = input.nextInt();

            if (salary >= 20000){
                System.out.print("High salary!!\n");
                salary = salary +2000;
            }
            else {
                System.out.print("Low salary!!");
                salary = salary + 100000;
            }
                System.out.println("Your New salary is : "+salary);

        }
    
}
