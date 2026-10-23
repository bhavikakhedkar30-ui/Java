package ObjectOrientedProgramming;

public class passingclassestomethods {
    public static class car{
        int seats;
        String name;
        double length;
        String type;
        int torque;
        double price;
        void print(){
            System.out.println(name+" , "+seats+" , "+length+" , "+type+" , "+torque+" , "+price);
        }

    }
    static void main(String[] args) {
       car c = new car();
        c.length = 3.99;
        c.type = "SUV";
        c.seats = 5;
        c.name = "BMW";
        c.torque = 178;
        c.price = 4.99;

        //change(c);
       // System.out.println("The price of the c is: " + c.price);

       // c.print();


    }
    private static void change(car x) {
        x.price = 6.99;
    }
}
