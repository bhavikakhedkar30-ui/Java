package Arrays;

public class Minelement {
    static void main(String[] args) {
        int[] arr ={10,3,45,6,7,8};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element is "+min);
    }
}
