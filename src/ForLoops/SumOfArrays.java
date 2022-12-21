public class SumOfArrays {
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }



    public static void SumArray(int[] arr1 , int[] arr2 , int[] output) {



//        int n = arr1.length-1;
//        int m = arr2.length-1;
//        int i = 0;
//        int j = 0;
//        int k = 0;
//
//        int min = Integer.MIN_VALUE;
//        int carry = 0;
//
//        while (i<=n && j<=m){
//
//            int sum = arr1[n-i] + arr2[m-j] + carry;
//            carry = sum/10;
//            int rem = sum%10;
//            output[output.length-1-i] = rem;
//
//            i++;
//            j++;
//            output[output.length-1-i] = carry;
//
//        }

        int i = arr1.length-1;
        int j = arr2.length-1;
        int carry = 0;
        int sum = 0;
        int k = Math.max(i,j);

        while (i>=0 && j>=0){

            sum = arr1[i]+arr2[j]+carry;
            carry = sum/10;
            int rem = sum%10;
            output[k] = rem;
            i--;
            j--;
            k--;
            output[k] = carry;
        }

        while (i>=0){

            sum = arr1[i] + carry;
            carry = sum/10;
            int rem = sum%10;
            output[k] = rem;
            i--;
        }
        while (j>=0){

            sum = arr2[j]+carry;
            carry = sum/10;
            int rem = sum%10;
            output[k] = rem;
            j--;

        }
        output[0] = carry;
//        int ans = 0;
//        if(carry==1)
//            ans = 10;
//
//        for (i = 0; i < arr1.length-1 ; i++) {
//            ans = ans*output[i];
//            ans = ans*10;
//        }





    }

    public static void main(String[] args) {
        int[] arr1= {6,2,4};
        int[] arr2 = {0};
        int[] output = new int[1+Math.max(args.length, arr2.length)];
        SumArray(arr1,arr2 ,output);
        print(output);


    }
}
