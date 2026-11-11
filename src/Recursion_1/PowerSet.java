package Recursion_1;

public class PowerSet {
    public static void subset(String ans , String s , int idx){
        if(idx == s.length()){
            System.out.print(ans+ " ");
            return;
        }
        subset(ans+s.charAt(idx),s,idx+1);
        subset(ans,s,idx+1);
    }
    static void main(String[] args) {
        String s = "abc";
        subset("",s,0);
    }
}
