package mirrorPatterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        int n =sn.nextInt();

        int mid = (n+1)/2;
        //upper
        for(int i = 1; i<= mid ; i++ ){
            //spaces
            for (int s=1; s<=(mid-i); s++){
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=(i*2-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower
        for(int i = 1; i<= (mid-1) ; i++ ){
            //spaces
            for (int s=1; s<=i; s++){
                System.out.print(" ");
            }
            //stars
            for (int j=1; j<=(2*(mid-i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

