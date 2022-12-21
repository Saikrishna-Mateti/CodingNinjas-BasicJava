public class FahrenheittoCelsiusTable {

        public static int func1(int a , int b)
        {
            System.out.println("int sum");
            return a + b;
        }
        public static long func1(long a , long b){
            System.out.println("inside sum");
            return a+b;
        }
    public static void main(String[] args) {
            int a = 10;
            int b = 10;
        System.out.println(func1(a,b));
        }
}
