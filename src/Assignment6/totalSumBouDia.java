package Assignment6;

public class totalSumBouDia {

    public static void totalSum(int[][] arr) {
        int N =arr.length;
        int requiredSum = 0;

        // Traverse arr[][]
        // Loop from i to N-1 for rows
        for (int i = 0; i < N; i++) {

            // Loop from j = N-1 for columns
            for (int j = 0; j < N; j++) {

                // Condition for diagonal
                // elements
                if (i == j || (i + j) == N - 1) {
                    requiredSum += arr[i][j];
                }

                // Condition for Boundary
                // elements
                else if (i == 0 || j == 0 || i == N - 1|| j == N - 1) {
                    requiredSum += arr[i][j];
                }
            }
        }

        // Print the final Sum
        System.out.println(requiredSum);
    }
    
}
