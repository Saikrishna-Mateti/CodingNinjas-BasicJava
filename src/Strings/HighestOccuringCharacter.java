public class HighestOccuringCharacter {
    public static char highestOccuringChar(String str) {
        //Your code goes here


        int[] count = new int[256];

        for(int i = 0 ; i<str.length() ; i++){

            count[str.charAt(i)]++;

        }

        int max = Integer.MIN_VALUE;

        char result = ' ';

        for(int i = 0 ; i<str.length(); i++){
            if(max < count[str.charAt(i)]){

                max = count[str.charAt(i)];
                result = str.charAt(i);

            }

        }

        return result;

    }
}
