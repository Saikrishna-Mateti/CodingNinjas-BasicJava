import java.util.Scanner;

public class CheckNumberSequence {
    public static void main(String[] args) {
        // Write your code here\

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int prev = s.nextInt();
        int pre = s.nextInt();
        int count = 0;

        for(int i = 1 ; i<=n-2; ++i){

            int cur = s.nextInt();
            if(prev==pre || pre==cur){
                System.out.println("false");
                return;
            }

            else if(prev>pre && pre<cur){
                count++;
            }else if(prev<pre && pre>cur){
                count++;
            }

            prev = pre;
            pre = cur;


        }
        if(count>1){
            System.out.println("false");

        }else{
            System.out.println("true");
        }

    }
}
