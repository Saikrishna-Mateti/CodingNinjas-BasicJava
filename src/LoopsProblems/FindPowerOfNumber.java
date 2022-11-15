import java.util.Scanner;
public class FindPowerOfNumber {
    public class Solution {

        public static void main(String[] args) {
            // Write your code here
            Scanner s = new Scanner(System.in);

            int x,n;
            x = s.nextInt();
            n = s.nextInt();

            int i = 1;

            while (n!=0 && x<= 8 && n<=9 ){
                i = i*x;
                --n;

            }
            System.out.println(i);

        }
    }
}
