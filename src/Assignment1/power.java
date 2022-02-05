package Assignment1;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int n = s.nextInt();
        if (n==0){
            System.out.println("1");
        }else {
            int y = x;
            for (int i = 1; i < n; i++) {
                y = y * x;
            }
            System.out.println(y);

        }
    }
}
