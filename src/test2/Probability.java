package test2;

import java.util.Scanner;

public class Probability {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        System.out.println(probability(n, x));
    }
    public static int probability(int a, int b) {
        int factN1 =factorial(4);
        int factN2 =factorial(8);
        int factNA = factorial((4-(a-b)));
        int factX=factorial(a);
        int factR=factorial(b);
        int factNY=factorial((a-b));
        int factNR=factorial(4-b);
        int factNX=factorial(8-a);
        int p =factN1/(factR*factNR);
        int q =factN1/(factNY*factNA);
        int r =factN2/(factX*factNX);
        int result = ((p*q)*100)/r ;
        return result;
    }
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

