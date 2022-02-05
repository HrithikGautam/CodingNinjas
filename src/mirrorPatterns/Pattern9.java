package mirrorPatterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();

        int mid = (n+1)/2;
        //upper
        int i=1;
        while (i<=mid) {

            //space
            int s = 1;
            while (s <= mid - i) {
                System.out.print(" ");
                s++;
            }

            //stars
            int j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }

    //lower
        while (i<=mid-1){

            //space
            int s=1;
            while (s<=i){
                System.out.print(" ");
                s++;
            }

            //stars
            int j=1;
            while(j<=2*(mid-i)+1){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
