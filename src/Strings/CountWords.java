public class CountWords {
    public static int countWords(String str) {


        int in = 1;
        int out = 0;
        int state = out;

        int wordcount = 0;

        int i = 0;

        while(i<str.length()){

            if(str.charAt(i) == ' ' ){

                state = out;

            }
            else if(state == out){
                state = in;
                wordcount++;
            }
            i++;
        }
        return wordcount;

    }
}
