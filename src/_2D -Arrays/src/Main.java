import java.util.Scanner;

public class Main {
    public static void sumarray2d(int[][] arr){

//        int rows = arr.length;
//        int cols = arr[0].length;
        int min = Integer.MIN_VALUE;

        int row = arr.length;
        if (row == 0){
            System.out.println ( "row" +" "+row+" "+min);
            return;
        }

        int cols = arr[0].length;

        int max = Integer.MIN_VALUE;
        int max1 = Integer.MIN_VALUE;

        int i =0;
        int rowIndex = -1;

        for(; i < row; i++)
        {
            int sumRow = 0;
            for(int j = 0; j < cols; j++)
            {
                sumRow = sumRow + arr[i][j];
            }

            if (sumRow > max){
                max = sumRow;
                rowIndex = i;
            }

            int sumCols = 0;

            for (int k = 0; k < row ; k++) {
                sumCols += arr[k][i];
            }
            if (sumCols > max1){
                max1 = sumCols;
                rowIndex = i;
            }

        }

//        int j = 0;
//        int colIndex = -1;
//
//        for ( ; j < cols ; j++) {
//
//            int sumCols = 0;
//
//            for (int k = 0; k < row ; k++) {
//                sumCols += arr[k][j];
//            }
//            if (sumCols > max1){
//                max1 = sumCols;
//                colIndex = j;
//            }
//        }

        if (max >= max1){
            System.out.println ( "row" +" "+rowIndex+" "+max);
        }
        else {
            System.out.println ( "column" +" "+rowIndex+" "+max1);
        }
    }

//    public static int[][] takeinput(){
//
//
//        Scanner s = new Scanner(System.in);
//        System.out.println("rows :");
//        int rows = s.nextInt();
//        System.out.println("cols :");
//        int cols = s.nextInt();
//
//        int[][] arr = new int[rows][cols];
//
//        for (int i = 0; i < rows ; i++) {
//            for (int j = 0; j < cols ; j++) {
//                arr[i][j] = s.nextInt();
//            }
//        }
//        return arr;
//
//    }

    public static void main(String[] args) {

//        int[][] arr = takeinput();

        int[][] arr = {{3,6,9} , {1,4,7} , {2,8,9}};
//        int[][] arr = {{1,1} ,{1,1}};
        sumarray2d(arr);

    }
}