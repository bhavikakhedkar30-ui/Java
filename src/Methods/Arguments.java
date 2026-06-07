package Methods;

public class Arguments {
    public static void max(int a, int b , int c) //<-Parameters//
     {
         if(a>=b && a>=c){
             System.out.println(a);
         } else if (b>=a && b>= c){
             System.out.println(b);
         }
         else{
             System.out.println(c);
         }
     }
    static void main() {
        max(554,649,650); //Arguments//;
    }
}
