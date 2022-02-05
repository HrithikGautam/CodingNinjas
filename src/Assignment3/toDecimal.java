package Assignment3;

import java.util.Scanner;

public class toDecimal {
    public static void main(String[] args) {

        Scanner s= new Scanner(System.in);
        long num = s.nextInt();

      int dec_val=0;
        int base =1;
        long temp=num;

        while (temp > 0) {
            long last_digit = temp % 10;
            temp = temp / 10;

            dec_val += last_digit * base;

            base = base * 2;
        }
            System.out.println(dec_val);
        }
    }

