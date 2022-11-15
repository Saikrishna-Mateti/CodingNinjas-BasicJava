import java.util.Scanner;
public class SumOfEven_Odd {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int a = 0;
        int b = 0;

        while (N>0){
            if(N%2 == 0){
                a =  a + N % 10;
            }else{
                b = b + N % 10;
            }
            N = N / 10;
        }

        System.out.println( a + " " + b);

    }
}
