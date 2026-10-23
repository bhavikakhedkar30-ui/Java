package ObjectOrientedProgramming;

public class polymorphism {
    public static class dog{
        void speak(){
            System.out.println("bow bow");
        }


    }

    public static class cat{
        void speak(){
            System.out.println("meow meow");
        }

    }

    public static class lion{
        void speak(){
            System.out.println("roarr!");
        }
    }
    public static class pikachu{
        void speak(){
            System.out.println("pika pika!");
        }
    }
    public static class human{
            void  speak(){
                System.out.println("hello");
            }
    }


    static void main(String[] args) {
        human h = new human();
        dog d = new dog();
        cat c = new cat();
        pikachu p = new pikachu();

        h.speak();
        d.speak();
        c.speak();
        p.speak();



    }
}
