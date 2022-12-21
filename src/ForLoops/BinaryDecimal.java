import java.util.Scanner;

public class BinaryDecimal {
    public static void main(String[] args) {
        // Write your code here

        Scanner s = new Scanner(System.in);

        int BinaryNum = s.nextInt();
        int dec = 0;
        int temp = BinaryNum;
        int base = 1;

        while(temp!=0){

            int rem = temp % 10;
            temp = temp/10;

            dec += rem*base;
            base = base*2;


        }
        System.out.println(dec);

    }
}
