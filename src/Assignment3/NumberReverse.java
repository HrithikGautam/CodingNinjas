package Assignment3;

import java.util.Scanner;

public class NumberReverse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int reverse=0;

        reverse = 0;
        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println(reverse);
    }
}
