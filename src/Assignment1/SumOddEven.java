package Assignment1;

import java.util.Scanner;

public class SumOddEven {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int evenSum=0;
        int oddSum=0;
        while(n>0) {
            int a = n % 10;
            if (a % 2 == 0) {
                evenSum += a;
            } else {
                oddSum += a;
            }
            n=n/10;

        }
        System.out.println(evenSum + " " + oddSum);


    }

}
