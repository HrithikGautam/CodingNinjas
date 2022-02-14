package Assignment6;

import java.util.Scanner;

public class LargestRowCol {

    static Scanner s= new Scanner(System.in);
    public static void findLargest(int arr[][]){

        if(arr.length==0){
            System.out.println("row 0"+ Integer.MIN_VALUE);
            return;
        }

        int m= arr.length;
        int n= arr[0].length;
        int max =Integer.MIN_VALUE;
        int q= 0;
        String s ="";

        for(int i =0; i<m; i++){
            int sum =0;
            for(int j=0; j<n; j++){
                sum+=arr[i][j];
            }
            if(sum>max){
                max=sum;
                q=i;
                s= "row";
            }

        }

        for(int i =0; i<n; i++){
            int sum =0;
            for(int j=0; j<m; j++){
                sum+=arr[j][i];
            }
            if(sum>max){
                max=sum;
                q=i;
                s= "coloumn";
            }

        }
        System.out.println(s+" "+q+" "+max);
    }

    public static int[][] takeInput(){
        int numRows = s.nextInt();
        int numCols = s.nextInt();
        int[][] input = new int[numRows][numCols];
        for (int i=0; i<numRows; i++){
            for (int j=0; j<numCols; j++){
                input[i][j] = s.nextInt();
            }
        }
        return input;
    }

    public static void main(String[] args) {

        int input[][] = takeInput();
        findLargest(input);
    }
}
