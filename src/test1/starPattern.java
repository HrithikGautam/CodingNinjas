package test1;

import java.util.Scanner;

public class starPattern {
    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);
        int lines = s.nextInt();

        int i, j;
        for (i = 1; i <= lines; i++) {// this loop is used to print the lines
            for (j = lines; j >= 1; j--) {// this loop is used to print numbers in a line
                if (j != i)
                    System.out.print(j);
                else
                    System.out.print("*");
            }
            System.out.println("");
        }
    }
}
