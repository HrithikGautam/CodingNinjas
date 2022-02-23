package Recursion;

import java.util.Scanner;

public class ArraySum {

    public static int sum(int input[] , int i) {

        if(i==input.length){
            return 0;
        }
        return input[i]+sum(input,i+1);
    }


    public static int sum(int input[]) {

        return sum(input,0);

    }
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int input[] = new int[n];
        for(int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        System.out.println(sum(input));
    }
}
