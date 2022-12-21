import java.util.Scanner;

public class ReverseNumberPattern {
    public static void main(String[] args) {



        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int i = 1;

        while(i<=N){

            int j = 1;
            while(j<=i){

                System.out.print( i - j + 1);
                j++;
            }

            System.out.println();
            i++;
        }


    }

}
