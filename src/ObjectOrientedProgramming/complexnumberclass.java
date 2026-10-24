package ObjectOrientedProgramming;

class complexnumber{
    int x ;
    int y;

    complexnumber(int x,int y){
        this.x=x;
        this.y=y;
    }
    void print(){
      if(y>=0) System.out.println(x+" + "+y+"i");
      else System.out.println(x+" - "+(-y)+"i");
    }

    public void add(complexnumber c) {
        x = x*c.x-y*c.y;
        y = y*c.x+c.y;
    }
    public void mul(complexnumber c) {
        x *=c.x;
        y *=c.y;
    }

//    static int add(int a,int b){
//        return a+b;
//    }
//    static int mul(int a,int b){
//        return a*b;
//    }
}

public class complexnumberclass {
    static void main(String[] args) {
        complexnumber c1 = new complexnumber(2,-3);
        complexnumber c2 = new complexnumber(2,8);
        c1.print();
        c2.print();
        c1.add(c2);
        c1.mul(c2);

    }
}
