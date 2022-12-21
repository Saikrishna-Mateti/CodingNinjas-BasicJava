import java.util.Scanner;

public class DiamondOfStars {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int n1 = (n+1)/2;
        int n2 = n1-1;

        int  i = 1;
        while(i<=n1){

            int j = 1;
            while(j<=n2){

                System.out.print(" ");
                j++;

            }
            n2--;

            int k = 1;
            while(k<=(2*i)-1){
                System.out.print("*");
                k++;
            }
            System.out.println("");
            i++;

        }

        n2 = 1;

        int row = 1;
        while(row<=(n1-1)){

            int j=1;
            while(j<=n2){
                System.out.print(" ");
                j++;
            }
            n2++;
            int k = 1;
            while(k<= 2*(n1-row)-1){
                System.out.print("*");
                k++;
            }
            System.out.println("");
            row++;
        }

    }
}
