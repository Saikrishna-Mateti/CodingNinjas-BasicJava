public class Sort012 {
    public static void sort012(int[] arr){
        //Your code goes here

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length-1; j++) {

        //         if(arr[j] > arr[j+1]){

        //         int temp = arr[j];
        //         arr[j] = arr[j+1];
        //         arr[j+1] = temp;

        //         }

        //     }
        // }

        // for (int i = 1; i < arr.length; i++) {

        //         int current = arr[i];

        //         int j = i-1;

        //         while(j>=0 && arr[j] > current){

        //             arr[j+1] = arr[j];
        //             j--;

        //         }

        //         arr[j+1] = current;


        // }

        int l = 0;
        int mid = 0;
        int r = arr.length-1;

        while(mid <= r ) {

            if (arr[mid] == 0) {

                int temp = arr[l];
                arr[l] = arr[mid];
                arr[mid] = temp;
                l++;
                mid++;

            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {

                int temp = arr[mid];
                arr[mid] = arr[r];
                arr[r] = temp;

                r--;

            }
        }
    }
}
