package Recursion;

public class basicProblem1 {
    public static int sumn(int n){
        if(n==0){
            return 0;
        }
        int smallOutput=sumn(n-1);
        int output=n+smallOutput;
        return output;
    }

    public static void print1ton(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        print1ton(n-1);

    }

    public static void main(String[] args){

        System.out.println(sumn(4));
        print1ton(5);
    }
}
