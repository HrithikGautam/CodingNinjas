package Assignment2;

import java.util.Scanner;

public class sumPattern {
    public static void main(String[] args) {

        int i,j,k=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (i = 1; i <= n; i++) {

            for ( j = 1; j <= i; j++) {

                k = k + j;
                System.out.print(j);
                    if (j == i) {
                        System.out.print("=" + k);
                    } else {
                        System.out.print("+");
                    }
            }
            System.out.println();
            k = 0;
        }
    }
}
