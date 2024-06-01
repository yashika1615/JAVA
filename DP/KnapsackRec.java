package DP;

import java.util.*;

public class KnapsackRec {
    public static int Knapsack(int val[], int wt[], int W, int n) {
        // base case
        if (W == 0 || n == 0)
            return 0;
        if (wt[n - 1] <= W) { // valid ans -> include and not include
            // include
            int ans1 = val[n - 1] + Knapsack(val, wt, W - wt[n - 1], n - 1);
            // exclude
            int ans2 = Knapsack(val, wt, W, n - 1);
            return Math.max(ans1, ans2);
        } else {
            // not valid ans
            // exclude
            return Knapsack(val, wt, W, n - 1);
        }
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int ans = 0;
        System.out.println(Knapsack(val, wt, W, val.length));
    }
}
