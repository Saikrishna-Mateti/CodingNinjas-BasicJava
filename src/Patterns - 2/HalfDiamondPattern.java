import java.util.Scanner;

public class HalfDiamondPattern {
    public static void main(String[] args) {
        // Write your code here

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        System.out.println("*");

        int i = 1;

        while(i<=n){

            int j = 1;
            System.out.print("*");
            while(j<=i){
                System.out.print(j);
                j++;
            }
            j--;
            while(--j>=1){
                System.out.print(j);

            }
            System.out.println("*");
            i++;


        }

        int row = n-1;
        while(row >=1){

            int col = 1;
            System.out.print("*");
            while(col<=row){

                System.out.print(col);
                col++;
            }
            col--;
            while(--col>=1){
                System.out.print(col);
            }
            System.out.println("*");
            row--;

        }

        System.out.println("*");


    }
}
