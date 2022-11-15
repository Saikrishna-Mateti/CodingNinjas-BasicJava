import java.util.Scanner;
public class Fahrenheit_to_CelsiusTable {
    public static void main(String[] args) {
        int S , E , W, conv = 0;
        Scanner s = new Scanner(System.in);
        S = s.nextInt();
        E = s.nextInt();
        W = s.nextInt();

        while(S<=E){

            conv = ((S-32) * 5/9);
            System.out.println( S + " " + conv );
            S = S + W;

        }


    }
}
