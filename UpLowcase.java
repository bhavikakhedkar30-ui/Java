//Check Weather the alphabet entered is upper case or lower case//

import java.util.Scanner;

public class UpLowcase {
        public static void main(String[] args) {
            Scanner in = new Scanner (System.in);
            char ch = in.next().trim().charAt(0);
            if(ch>='a' && ch<='z'){
                System.out.println("lower case");
            }
            else{
                System.out.println("upper case");
            }

        }
}
