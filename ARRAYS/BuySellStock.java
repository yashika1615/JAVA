/*
 * BEST TIME TO BUT AND SELL STOCKS 
 *  prices[]= [7,1,5,3,6,4]
 you are given an array prices where prices[i] is the price of a given stock on the ith day.
 You want to maximise your profit by choosing a single day to buy 1 stock and choosing a different day 
 to buy 1 stock and choosing a different day in future to sell that stock 
   return the max profit you can achieve from this transaction. If you
   cannot achieve any profit, return zero
*/

// proft - bp less, sp more 

package ARRAYS;

public class BuySellStock {
    public static int buyandsellstocks(int prices[]) {
        int bp = Integer.MAX_VALUE; // bp: buying price
        int mp = 0; // mp: maximum profit

        // Iterate over the prices array
        for (int i = 0; i < prices.length; i++) {
            if (bp < prices[i]) { // Profit
                // Today's profit
                int p = prices[i] - bp;
                // Maximum profit so far
                mp = Math.max(mp, p);
            } else {
                // Update buying price
                bp = prices[i];
            }
        }
        return mp;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyandsellstocks(prices));
    }
}
