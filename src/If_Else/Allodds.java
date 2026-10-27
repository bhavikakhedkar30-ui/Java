package If_Else;

public class Allodds {
    static void main(String[] args) {
        for(int i = 1; i <= 100; i++){
            if(i%3==0 && i%2!=0){
                System.out.println(i);
            }
        }
    }
}
