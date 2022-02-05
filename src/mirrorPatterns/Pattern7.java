package mirrorPatterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int spaces=1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces=spaces+1;
            }
            int num=i;
            int j =1;
            while(j<=i){
                System.out.print(num);
                num+=1;
                j+=1;
            }
            int dec=num-2;
            int k =1 ;
            while(k<i){
                System.out.print(dec);
                dec-=1;
                k++;
            }
            System.out.println();
            i=i+1;
        }
    }
}
