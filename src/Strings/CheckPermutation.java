import java.util.Arrays;

public class CheckPermutation {
    public static boolean isPermutation(String str1, String str2) {
        //Your code goes here

        int a1 = str1.length();
        int a2 = str2.length();

        boolean isCheckPermutation = true;

        if (a1!=a2){
            return false;
        }
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < a1 ; i++) {
            if (ch1[i] != ch2[i]){
                isCheckPermutation = false;
            }
        }
        return isCheckPermutation;

    }
}
