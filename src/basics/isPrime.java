package basics;

import java.util.Scanner;

public class isPrime {

    public static void main(String args[]) {

        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int div=2;
        boolean isPrime=true;

        while(div<=n-1){
            if(n%div==0){
                isPrime=false;
                System.out.println(div);
            }
            div=div+1;
        }
        if(isPrime==true){
            System.out.println("Prime");
        }else{
            System.out.println("Composite");
        }


    }
}

