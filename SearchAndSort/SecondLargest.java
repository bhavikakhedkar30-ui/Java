public class SecondLargest {
    public static int main(String[] args) {
        int arr [] = {1,3,5,7,9,11,13,15,100};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;

        for (int j = 0 ; j < arr.length ; j++){
            
        }
    }
}
