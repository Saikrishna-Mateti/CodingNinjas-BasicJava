import java.util.Scanner;

public class TermsOfAp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int count=0;
        for (int i = 1; i <=x+count ; i++) {
            int ap = 3*i+2;
            if(ap%4==0)
                count++;
            else
                System.out.println(ap +" ");
        }


    }
}
