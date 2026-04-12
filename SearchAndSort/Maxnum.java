public class Maxnum {
    public static void main(String[] args) {
        int arr [] = {1,3,5,7,9,11,13,15,100};
        int max = arr[0] ;
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                    max = arr[i];
                    
                    
            }
        }
        System.out.println("Max Element: " + max);
                    
    }
}
