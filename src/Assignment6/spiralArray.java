package Assignment6;

public class spiralArray {

    public static void spiralPrint(int matrix[][]){
        if(matrix.length==0){
            return;
        }
        int rstart =0 , rend= matrix.length-1 , cstart=0, cend=matrix[0].length-1;
        int count = (matrix.length)*(matrix[0].length);
        while(count>0)
        {
            //left to right
            for(int i =cstart ; i<=cend ; i++){
                System.out.print(matrix[rstart][i]+" ");
                count--;
            }
            rstart++;

            //top to bottom
            for (int i =rstart; i<=rend;i++){
                System.out.print(matrix[i][cend]+" ");
                count--;
            }
            cend--;

            //right to left
            for(int i=cend;i>=cstart;i--){
                System.out.print(matrix[rend][i]+" ");
                count--;
            }
            rend--;

            //bottom to top
            for (int i = rend;i>=rstart;i--){
                System.out.print(matrix[i][cstart]+" ");
                count--;
            }
            cstart++;
        }
    }
}