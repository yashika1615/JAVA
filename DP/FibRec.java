// exponential time complexity - O(2^n)

package DP;

import java.util.*;

public class FibRec {
    public static int fib(int n) {
        // base case
        if (n == 0 || n == 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

}
