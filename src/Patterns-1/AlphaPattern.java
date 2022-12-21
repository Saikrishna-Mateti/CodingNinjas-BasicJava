import java.util.Scanner;

public class AlphaPattern {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int i = 1;
        while(i<=N){
            int j = 1;
            while(j<=i){

                char value = (char)('A'+i-1);
                System.out.print(value);
                j++;

            }

            System.out.println();
            i++;
        }


    }

}
