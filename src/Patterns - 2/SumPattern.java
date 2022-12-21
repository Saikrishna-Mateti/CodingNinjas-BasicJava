import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int i = 1;

        while(i<=n){

            int j = 1;
            int sum = 0;

            while(j<=i){

                sum = sum + j;
                System.out.print(j);

                if(i>j){
                    System.out.print("+");
                }
                j++;
            }
            System.out.println("=" +sum);
            i++;
        }
    }
}
