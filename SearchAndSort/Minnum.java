//The logic is -> ask yourself that "is the first element in arr greater than the second"
//
public class Minnum {
    public static void main(String[] args) {
        int arr [] = {1,3,5,7,9,-11,13,15,100};
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
            
        }
        System.out.println("min term : "+min);
    }
}
