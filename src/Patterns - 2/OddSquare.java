import java.util.Scanner;

public class OddSquare {
    public static void main(String[] args) {
        // Write your code here

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int i = 1;

        while(i<=n){

            int j = i;

            while(j<=n){
                int odd = 2*j-1;
                System.out.print(odd);
                j++;

            }

            int k = 1;
            while(k<=i-1){
                System.out.print(2*k-1);
                k++;
            }

            System.out.println();
            i++;

        }



    }
}
