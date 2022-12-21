public class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str) {
        //Your code goes here


        String output = "";

        for(int i = 0 ; i<str.length()-1 ; i++){

            if(str.charAt(i) != str.charAt(i+1) ){

                output += str.charAt(i);

            }

        }


        output+= str.charAt(str.length()-1);
        return output;

    }
}
