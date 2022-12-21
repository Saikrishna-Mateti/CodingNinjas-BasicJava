public class SumofTwoArrays {
    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        //Your code goes her


        int n = arr1.length-1;
        int m = arr2.length-1;

        int i =0;
        int j = 0;
        int k =0;

        int carry = 0;



        while(i<n+1 && j<m+1){


            int sum = arr1[n-i] + arr2[m-j] + carry;
            carry = sum/10;
            int rem = sum%10;

            output[(output.length-1)-i] = rem;

            i++;
            j++;

            output[(output.length-1)-i] = carry;

        }

        while(i<n+1){

            int sum = arr1[n-i] + carry;
            carry = sum/10;
            int rem = sum%10;
            output[output.length-1-i] = rem;
            i++;

        }

        while(j<m+1){

            int sum = arr2[j] + carry;
            carry = sum/10;
            int rem = sum%10;
            output[output.length-1-i] = rem;
            j++;

        }
        output[0] = carry;

    }

}
