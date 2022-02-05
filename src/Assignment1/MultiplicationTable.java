package Assignment1;

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n = s.nextInt();

        for(int i= 1; i<= 10;){
            int a = n*i;
            System.out.println(a);
            i=i +1;
        }

    }
}
