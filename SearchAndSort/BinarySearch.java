public class BinarySearch {
    public static void main(String[] args) {

        int [] arr = {-1,0,2,3,4,15,16,18,22,25};
        int target = -2;
        int ans = binary(arr, -2);
        System.out.println(target+" found at index: "+ans);

    }

    static int binary(int [] arr,int target){

        int str = 0;
        int end = arr.length-1;
        
        while(str<=end){
            int mid = str + (end-str)/2;
            if(target < arr[mid]){
                end = mid -1 ;

            }else if (target > arr[mid]){
                str = mid+1;
                

            }else{
                return mid;
            }
        }
        return -1;

    }
}
