public class BinarySearch {
    public static int binarySearch(int[] arr, int x) {
        //Your code goes here

        int l = 0;
        int r = arr.length -1;

        int mid = 0;

        while(l<=r){

            mid = (l+r)/2;

            if(arr[mid] < x ){
                l = mid+1;
            }

            else if(arr[mid] > x){
                r = mid-1;
            }

            else if(arr[mid] == x){
                return mid;
            }


        }

        return -1;
    }
}
