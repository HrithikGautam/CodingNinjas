package Assignment3;

import java.util.Scanner;

public class toBinary {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long i=1,rem ,binary = 0;

        while(n!=0){
            rem=n%2;
            binary+=i*rem;
            n=n/2;
            i=i*10;
        }
            System.out.println(binary);
        }
}
