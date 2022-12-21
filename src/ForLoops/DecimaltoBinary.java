import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        // Write your code here

        Scanner s = new Scanner(System.in);

        long N = s.nextInt();
        long base = 1;
        long ans = 0;


        while(N!=0){

            long reminder = N%2;
            ans = ans + reminder*base;
            base = base*10;
            N  = N/2;

        }
        System.out.println(ans);

    }
}
