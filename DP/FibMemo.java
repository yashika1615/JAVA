/*Mechanism
  f[n] -> store (storage) 
      like fib[2]=1
    psvm(){
        int f= new int[n+1]
    }
 */

// linear Time complexity- O(n)

package DP;

import java.util.*;

public class FibMemo {
    public static int FibMemoization(int n, int[] f) {
        // base case
        if (n == 0 || n == 1)
            return n;
        // check f[n] is already calculated or not
        if (f[n] != 0)
            return f[n];
        // fibonacci code but store it somewhere
        f[n] = FibMemoization(n - 1, f) + FibMemoization(n - 2, f);
        return f[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f[] = new int[n + 1];
        System.out.println(FibMemoization(n, f));

    }

}
