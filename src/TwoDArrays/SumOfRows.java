package TwoDArrays;

public class SumOfRows {
    public static void rowWiseSum(int[][] mat) {

        int i, j, sum = 0;
        if(mat.length==0){
            return;
        }
        int n = mat.length;
        int m = mat[0].length ;

        for (i = 0; i < n; ++i) {
            for (j = 0; j < m; ++j) {

                sum = sum + mat[i][j];


            }
            System.out.print(sum+" ");
            // Reset the sum
            sum = 0;
        }
    }
}
