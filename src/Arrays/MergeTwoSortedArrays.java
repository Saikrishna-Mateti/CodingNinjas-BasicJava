public class MergeTwoSortedArrays {
    public static int[] merge(int arr1[], int arr2[]) {

        //Your code goes here

        // int[] k = new int[];

        // for(int i = 0 ; i<arr1.length ; i++){

        //     for(int j = 0 ; j<arr2.length ; j++){

        //         if(arr1[i] > arr2[j]){

        //             k = arr1[i];
        //             k++;

        //         }

        //         else if( arr1[i] < arr2[j] ){
        //           k = arr2[j];
        //             k++;
        //         }

        //     }

        // }

        int i = 0;
        int j = 0;
        int[] arr3 = new int[arr1.length+arr2.length];
        int k = 0;

        while( i < arr1.length && j<arr2.length  && k<arr3.length){

            if(arr1[i] <= arr2[j]){

                arr3[k] = arr1[i];
                i++;
                k++;

            }

            else if(arr1[i] >= arr2[j]){

                arr3[k] = arr2[j];
                j++;
                k++;

            }



        }
        while(i<arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }

        while(j<arr2.length){

            arr3[k] = arr2[j];
            j++;
            k++;


        }


        return arr3;



    }
}
