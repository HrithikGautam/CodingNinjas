package Assignment3;

import java.util.Scanner;
import java.math.*;

public class SquareRoot {

    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int k = (int)Math.sqrt(n);
        System.out.println(k);
    }
    /*public static double squareRoot(int num)
    {
        //temporary variable
        double temp;
        double sqrtroot=num/2;
        do
        {
            temp=sqrtroot;
            sqrtroot=(temp+(num/temp))/2;
        }
        while((temp-sqrtroot)!= 0);
        return sqrtroot;
   }*/
}
