package Assignment9Recursion;

public class GeomatricSum {

    public static double findGeometricSum(int k){

        if (k == 0)
            return 1;

        double ans = 1 / (double)Math.pow(2, k) + findGeometricSum(k - 1);

        return ans;
    }
}
