package Binary_Search;

public class DecreasingBS {
    static void main(String[] args) {
            int[] arr ={100,90,84,70,65,40,12,5,2};
            int low = 0;
            int high = arr.length-1;
            int tar = 12;


           // int ans = 0;
            while(low<=high){
                int mid = (low+high)/2;
                if(arr[mid]==tar){
                    System.out.println("target found at array index "+mid);
                  break;
                }
                 if(arr[mid]<tar){
                    high = mid - 1;
                }
                 if(arr[mid]>tar){
                    low = mid + 1;
                }
            }

    }
}
