public class ReverseEachWord {
    public static String reverseEachWord(String str) {
        //Your code goes here

        String input ="";

        int StartIndex = 0;


        int i = 0;
        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' '){

                int EndIndex = i-1;
                String Word = "";
                for (int j = StartIndex; j <= EndIndex ; j++) {

                    Word = str.charAt(j) + Word;

                }
                input += Word + " ";
                StartIndex = i+1;


            }



        }
        int EndIndex = i-1;
        String Word = "";
        for (int j = StartIndex; j <= EndIndex ; j++) {

            Word = str.charAt(j) + Word;

        }
        input += Word + " ";


        return input;

    }
}
