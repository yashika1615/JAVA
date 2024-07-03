public class Knapsackmem01 {
    public static int Knapsackmem(int val[], int wt[], int W, int n, int dp[][]) {
        if (W == 0 || n == 0) {
            return 0;
        }
        if (dp[n][w] != -1)
            return dp[n][w];

        if (wt <= w) {
            int ans1 = val[n - 1] + Knapsackmem(val, wt, w - wt, n - 1, dp);
            int ans2 = Knapsackmem(val, wt, W, n - 1, dp);
            dp[n][w] = Math.max(ans1, ans2);
        } else {
            dp[n][w] = Knapsackmem(val, wt, w, n - 1, dp);
            return dp[n][w];
        }
    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int w = 7;

        // create a 2-d dp array
        int dp[][] = new int[val.length + 1][w + 1];
        // initialize dp array
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp.length; j++) {
                // fill the dp array
                dp[i][i] = -1;
            }
        }
        System.out.println(Knapsackmem(val, wt, w, val.length, dp));
    }

}
