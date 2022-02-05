package basics;

import java.util.Scanner;

public class charatcterType1 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        char ch= s.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("\n" + " 1");
        }

        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("\n" + " 0");
        }
        else
        {
            System.out.println("\n" +" -1");
        }
    }
}
