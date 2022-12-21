import java.util.Scanner;

public class ReverseOfNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int rev = 0;
        while (n!=0 ) {
           rev = rev*10 + n % 10;
            n = n/10;
            if(rev==0)
                continue;
//            System.out.print();

        }
        System.out.print(rev+"");

    }
}
