package Strings;
import java.util.Scanner;
public class palindrome {

    static void palindrome(String s){
        int low = 0;
        int high = s.length() -1;
        Boolean flag = true;

        while (low < high){
            if(s.charAt(low) != s.charAt(high)){
                flag = false;
                break;
            }

            low ++;
            high --;
        }

        System.out.println(flag);
    }
    static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = sc.next();
       palindrome(s);

    }

}
