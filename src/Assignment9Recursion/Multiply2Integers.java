package Assignment9Recursion;

public class Multiply2Integers {

    public static int multiplyTwoIntegers(int m, int n){
        // Write your code here
        if(n==0)
            return 0;
        return m+multiplyTwoIntegers(m,n-1);
    }
}
