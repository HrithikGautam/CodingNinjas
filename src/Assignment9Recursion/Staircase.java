package Assignment9Recursion;

//A child is running up a staircase with N steps, and can hop either 1 step, 2 steps or 3 steps at a time.
// Implement a method to count how many possible ways the child can run up to the stairs. You need to return number of possible ways W.
public class Staircase {

    public static int staircase(int n){

        if(n<0)
            return 0;
        if(n==0)
            return 1;
        int op1=staircase(n-1);
        int op2=staircase(n-2);
        int op3=staircase(n-3);
        return op1+op2+op3;
    }
}
