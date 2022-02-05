package Assignment3;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int c = s.nextInt();
        int sum = 0, prod = 1,v=0,k= 1;

        for(int i=1;i <= n; i++)  {
            //for sum
            sum = sum + i;
            //for product
            prod = prod * i;
            }
        if (c == 1) {
            System.out.println(sum);
        }
        else if (c == 2) {
            System.out.println(prod);
        }
        else{
            System.out.println("-1");
        }
        }
    }


