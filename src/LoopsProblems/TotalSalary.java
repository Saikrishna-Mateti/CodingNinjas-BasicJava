import java.util.Scanner;
public class TotalSalary {
    public static void main(String[] args) {
        // Write your code here
        Scanner s = new Scanner(System.in);
        double basic = s.nextInt();
        char ch = s.next().charAt(0);
        int n = 100;
        int allow = 0;

        if(ch == 'A'){
            allow = 1700;
        }
        else if(ch == 'B'){

            allow = 1500;
        }
        else if(ch >= 'C' && ch<='Z'){
            allow = 1300;
        }

        double	hra = (20*basic)/n;
        double da = (50*basic)/n;
        double pf = (11*basic)/n;

        double totalSalary = basic + hra + da + allow - pf;
        System.out.println(Math.round(totalSalary));

    }
}
