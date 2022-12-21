import java.util.Scanner;

public class SquarePattern {
        public static void main(String[] args) {

            /* Your class should be named Solution.
             * Read input as specified in the question.
             * Print output as specified in the question.
             */

            Scanner s = new Scanner(System.in);

            int N = s.nextInt();
            int i = 1;

            while(i<=N){

                int j = 1;
                while(j<=N){
                    System.out.print(N);
                    j++;
                }
                System.out.println( );
                i++;

            }


        }
}
