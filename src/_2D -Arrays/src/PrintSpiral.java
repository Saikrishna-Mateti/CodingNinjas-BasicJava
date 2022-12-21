public class PrintSpiral {


    public static void Printspiral(int[][] matrix){

        int nRows = matrix.length;
        if (nRows==0){
            return;
        }

        int nCol = matrix[0].length;

        int rowstart = 0;
        int colstart = 0;
        int count=0;
        int total = nRows*nCol;


        while (count < total ) {

            for (int i = rowstart; count < total && i < nCol; i++) {

                System.out.print(matrix[colstart][i] + " ");
                count++;
            }
            rowstart++;

            for (int i = rowstart; count < total && i < nRows; i++) {
                System.out.print(matrix[i][nCol - 1] + " ");
                count++;
            }
            nCol--;

            for (int i = nCol-1; count < total && i >= colstart; i--) {
                System.out.print(matrix[nRows-1][i] + " ");
                count++;

            }
            nRows--;

            for (int i = nRows - 1; count < total && i >= rowstart; i--) {
                System.out.print(matrix[i][colstart] + " ");
                count++;
            }
            colstart++;
        }
    }

    public static void main(String[] args) {

//        int[][] matrix = {{1,2,3}};
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        Printspiral(matrix);

    }
}
