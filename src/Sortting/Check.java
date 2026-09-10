package Sortting;

public class Check {

    public static boolean sort(int [] arr , boolean bol){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i+1]){

                return bol;
            }

        }
        if(bol==false){
           // System.out.println("Sorted");
            bol = false;
            System.out.println("Not sorted"+bol);
            return bol=true;
        }
        else {
            System.out.println("sorted"+bol);
            return true;
        }

    }
   public static void main(String[]args) {
       int[] arr = {1,2,4,8,3,9};
       boolean bol = false;
       System.out.println(sort(arr, bol));
   }
}
