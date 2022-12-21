public class SelectionSort {

    public static void selectionSort(int[] arr) {
        //Your code goes here
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {

                if(arr[i] > arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;


                }
            }
        }
    }
}
