public class CompresstheString {
    public static String getCompressedString(String str) {
        // Write your code here.

        String output = "";
        output += str.charAt(0);

        int count = 1;

        for(int i=1 ; i < str.length() ; i++){

            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }
            else{
                if(count > 1){
                    output += count;
                    count = 1;
                }

                output += str.charAt(i);
            }


        }
        if(count > 1){
            output += count;
        }

        return output;

    }
}
