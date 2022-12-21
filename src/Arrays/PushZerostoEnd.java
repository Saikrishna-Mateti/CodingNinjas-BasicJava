public class PushZerostoEnd {
    public static void pushZerosAtEnd(int[] arr) {
        //Your code goes here

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr.length - 1; j++) {


        //         if(arr[i]==0){
        //         if(arr[i] >= arr[j]){

        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;

        //         }
        //         }

        //     }
        // }

        int n = arr.length;
        int i = 0;
        int count = 0;

        while(i<n){

            if(arr[i] != 0){

                arr[count] = arr[i];
                count++;
            }
            i++;

        }

        for(i = count ; i<n ; i++){
            arr[i] = 0;
        }


    }
}
