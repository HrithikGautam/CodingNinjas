package Functions;

import java.util.Scanner;

public class Sqrt {

    public static int sqrt(int n) {

        int count = 1;
        // To decrease the number till zero
        int i = n;

        //to increase the odd digits until n is zero
        for (int j = 1; j >= i; j += 2) {
            if (i >= 0) {
                i = i - j;
                count++;
            }
        }
        return count;
    }

        public static void main (String[]args){

            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            System.out.println(sqrt(n));
        }
}
