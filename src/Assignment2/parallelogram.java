package Assignment2;

import java.util.Scanner;

public class parallelogram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //spaces
            for (int s = 1; s <= i-1; s++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
