package ObjectOrientedProgramming;

public class RivisionOOPs {

    private  static class pokemon{

        int pwer;
        String type;


        pokemon(String t, int p){
            this.pwer =pwer ;
            this.type=type;
        }
    }
    static void main(String[] args) {

        // all of this without constructor
//        pokemon p1 = new pokemon();
//        p1.name = "Pikachu";
//        p1.type = "Electric";
//        p1.attack = 70;
//        pokemon p2 = new pokemon();
//        p2.name = "tokapi";
//        p2.type = "singing";
//        p2.attack = 110;
//
//        pokemon p3 = p1;//p3 can control p1 (p3 is shallow copy of p1)
//        p3.type= "Water";
//
//        System.out.println(p3.type);


        // with construtor
        pokemon p1 = new pokemon("Electric",70);


    }
}
