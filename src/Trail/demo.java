package Trail;

public class demo {
    static void main() {
        int arr[] ={10,20,30,40,50};
        int i ;
        for( i=0;i<arr.length;i++){

            if(i%2==0){
                arr[i]=arr[i]+10;
            }
        }
        System.out.println(arr[i]);
    }
}
