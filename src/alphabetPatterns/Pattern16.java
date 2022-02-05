package alphabetPatterns;

import java.util.Scanner;

public class Pattern16 {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        int n = s.nextInt();

        int i =n;
        while(i>=1){
            int j=i;
            while (j<=n){
                System.out.print((char)(j+64));
                j= j+1;
            }
            System.out.println();
            i--;
        }
    }
}
