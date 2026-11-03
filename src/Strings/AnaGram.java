package Strings;
import java.util.Arrays;
public class AnaGram {
    public static void main(String[] args) {
        String str1 = "Bhavika";
        String str2 = "ahikbav";

        if(str1.length() != str2.length()){
            System.out.println("Not Anagram");
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
         Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }

    }
}
