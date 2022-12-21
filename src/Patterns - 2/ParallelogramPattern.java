import java.util.Scanner;

public class ParallelogramPattern {
    public static void main(String[] args) {
        // Write your code here

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int i = 0;

        while(i<=n-1){

            int space = 0;

            while(space <= i -1){
                System.out.print(" ");
                space++;

            }

            int j = 0;
            while(j <= n-1-i ){
                System.out.print("*");
                j++;
            }

            int p = 1;
            while(p<=i){
                System.out.print("*");
                p++;
            }


            System.out.println();
            i++;



        }

    }
}
