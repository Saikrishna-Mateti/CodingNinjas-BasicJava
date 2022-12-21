public class PrintLikeWave {

    public static void wavePrint(int[][] mat){

//        for (int i = 0; i < mat.length ; i++) {
//            System.out.print(mat[i][0] + " ");
//        }
//        for (int i = 0; i < mat.length ; i++) {
//            System.out.print(mat[mat.length-1-i][1] + " ");
//        }
//        for (int i = 0; i < mat.length ; i++) {
//            System.out.print(mat[i][2] + " ");
//        }


//        int sum = 0;
//        int row = mat.length;
//        if (row == 0){
//            return;
//        }
//        int colum = mat[0].length;

        for (int col = 0; col < mat[0].length ; col++) {

            if (col%2 !=0 ){

                for (int i = mat.length-1 ; i >=0 ; i--) {
                    System.out.print(mat[i][col]+" ");

                }
            }

            else{

                for (int i = 0; i < mat.length ; i++) {
                    System.out.print(mat[i][col]+" ");
                }

            }
        }

    }

    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
//        int[][] mat = {{0}};
        wavePrint(mat);

    }
}
