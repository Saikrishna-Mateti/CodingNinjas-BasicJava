public class Removecharacter {
    public static String removeAllOccurrencesOfChar(String str, char ch) {


        // Your code goes here


        String output = "";

        for(int i = 0 ; i<str.length() ; i++){

            if(str.charAt(i) != ch ){
                output += str.charAt(i);
            }

        }

        return output;

    }
}
