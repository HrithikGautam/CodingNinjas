package alphabetPatterns;

import java.util.Scanner;

public class Pattern13 {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        char jthchar=(char)('A');
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(jthchar);
                j+=1;
            }
            jthchar +=1;
            System.out.println();
            i=i+1;
        }
    }
}
