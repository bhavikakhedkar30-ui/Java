import java.util.Scanner;

public class occurences {
    public static void main(String[] args) {
        int n[] ={1,3,2,1,3,3,5,5,6,7,8,9,1,1,1,};
        int count=0;
        System.out.println("Enter Number You need to Search: ");
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        for (int i = 0; i<n.length;i++){
            if(n[i]==A){
                 count ++;
            }
            
        }

        System.out.println("The entered number occured "+ count +" times ");
    }
    
}
