package DataStructures.DynamicProgramming2;

public class knapsack {
    public static int knapsack(int W, int val[], int wt[], int i) {

        if(i==val. length) {
            return 0;
        }

        int ans;
        if(wt[i] <= W) {
// including ith item
            int ans1 = val[i] + knapsack (W-wt[i],val, wt, i+1);
//excluding ith item
            int ans2 = knapsack (W,val, wt, i+1);
            ans = Math.max(ans1, ans2);
        }else {
            ans = knapsack(W, val,wt,i+1);
        }

        return ans;

    }
    public static void main(String[] args) {
// TODO Auto-generated method stub


        int val[] = {200, 300, 100};
        int wt[] = {20, 25, 30};

        int W = 50;

        int ans = knapsack(W,val,wt, 0);

    }

}
