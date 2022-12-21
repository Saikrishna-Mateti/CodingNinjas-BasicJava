public class StringPalindrome {
    public static boolean isPalindrome(String str) {
        //Your code goes here

        // String var = "";
        // boolean isPalindrome;

        // for(int i = str.length()-1 ; i>=0  ; i-- ){
        // 	var += str.charAt(i);
        // }

        // if(str.equals(var)){
        // 	isPalindrome = true;
        // }
        // else {
        // 	isPalindrome = false;
        // }

        // return isPalindrome;

        // Method Two Solution of Palindrome;


        int i = 0;
        int j = str.length()-1;
        boolean isPalindrome = true;

        while( i<str.length() && j>=0){

            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }

        }
        return isPalindrome;

    }
}
