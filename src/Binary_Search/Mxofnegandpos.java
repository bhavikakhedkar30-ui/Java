package Binary_Search;

public class Mxofnegandpos {
    public static void main(String[] args) {
        int[] arr ={-3,-2,-1,0,0,1,2};
        int low = 0;
        int high = arr.length-1;
        int neg =0  , pos = 0 ;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]<0){
                low = mid+1;
                neg++;

            }
            if(arr[mid]>0){
                high= mid-1;
                pos++;

            }

            if(arr[mid]>0){
                pos++;
            }else neg++;
        }

        if(neg > pos){
            System.out.print(neg);
        } else System.out.print(pos);
    }
}
