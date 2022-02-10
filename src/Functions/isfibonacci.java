package Functions;

import java.util.Scanner;

public class isfibonacci {

        static boolean perfect_square_check( int val){
            int s = (int) Math.sqrt(val);
            return (s * s == val);
        }

        static boolean fibonacci_num_check ( int n) {
            return perfect_square_check(5 * n * n + 4) || perfect_square_check(5 * n * n - 4);
        }

        public static void main (String[]args){

            Scanner s = new Scanner(System.in);
            int n = s.nextInt();

            System.out.println(fibonacci_num_check(n) ? "true" :"false");

            for (int i = 6; i <= 17; i++)
                System.out.println(fibonacci_num_check(i) ? i + " is a Fibonacci number" :
                        i + " is a not Fibonacci number");
        }
    }


