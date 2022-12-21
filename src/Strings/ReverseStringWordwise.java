public class ReverseStringWordwise {
    public static String reverseWordWise(String input) {
        // Write your code here

        String str = "";
        String Reverse = "" ;

        int StartIndex = 0;

        for(int i = 0 ; i < input.length() ; i++){

            str = input.charAt(i) + str;

        }

        Reverse = str;

        String reverseWordWise = "";

        int i = 0;

        for( ; i < Reverse.length() ; i++){

            if(Reverse.charAt(i) == ' '){

                int EndIndex = i-1;
                String Word = "";

                for(int j = StartIndex ;  j<= EndIndex ; j++){

                    Word  = Reverse.charAt(j) + Word;

                }

                reverseWordWise += Word + " ";

                StartIndex = i+1;


            }



        }

        int EndIndex = i-1;
        String Word = "";

        for(int j = StartIndex ;  j<= EndIndex ; j++){

            Word  = Reverse.charAt(j) + Word;

        }

        reverseWordWise += Word;

        return reverseWordWise;



    }
}
