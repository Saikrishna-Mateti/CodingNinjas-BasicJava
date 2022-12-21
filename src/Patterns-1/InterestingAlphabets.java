import java.util.Scanner;

public class InterestingAlphabets {
    public static void main(String[] args) {
        //Your code goes here

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;

        while(i<=N){
            char p = (char)('A'+N-i);
            int  j = 1;
            while(j<=i){

                System.out.print(p);
                p++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
