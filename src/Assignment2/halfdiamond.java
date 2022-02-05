package Assignment2;

import java.util.Scanner;

public class halfdiamond {
    public static void main(String[] args) {

        int i, j;

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        System.out.println("*");
        // Print the first upper half
        for (i = 1; i <= N; i++) {
           //border
            System.out.print("*");
            //number
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.print("*");
            System.out.println();
        }

        // Print the lower half of the pattern
        for (i = N - 1; i >= 1; i--) {
            //border
            System.out.print("*");
            //number
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.print("*");
            System.out.println();
        }
        System.out.print("*");
    }
}
