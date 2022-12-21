public class _2dArray {


    public static void SumOfarray2d(int[][] mat){

        int sum = 0;

        for (int i = 0; i <mat.length; i++) {

                sum += mat[0][i];
                sum += mat[mat.length-1][i];

        }
        for (int i = 1 ; i < mat.length-1; i++) {

                sum += mat[i][0];
                sum += mat[i][mat.length - 1];
        }

        for (int i = 1; i < mat.length-1 ; i++) {
            sum += mat[i][i];
            sum += mat[i][mat.length-1-i];
        }

        if (mat.length%2!=0){

            sum -= mat[mat.length/2][mat.length/2];

        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
//        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr = {{6,9,8,5,9},{2,4,1,8,3},{9,3,8,7,8},{6,8,9,4,1},{1,7,6,1,5}};
        SumOfarray2d(arr);

    }
}
