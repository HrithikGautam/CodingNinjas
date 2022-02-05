package Assignment1;

import java.util.Scanner;

public class TemperatureTable {

    public static void temp(int c , int k , int w){
        for (int i= c; i<= k; i=i+w){
            int  C;
            C = ((i-32)*5)/9;
            System.out.println(i +" "+ C);
        }
        return;
    }

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int S =s.nextInt();
        int E =s.nextInt();
        int W =s.nextInt();
       temp(S,E,W);
    }
}
