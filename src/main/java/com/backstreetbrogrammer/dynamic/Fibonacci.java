package com.backstreetbrogrammer.dynamic;

import java.time.Duration;
import java.time.Instant;

public class Fibonacci {

    public static void main(String[] args) {
        for (int i = 20; i <= 50; i += 10) {
            final Instant start = Instant.now();
            System.out.printf("fibonacci(%d)=%d%n", i, fibonacciBottomUp(i));
            final long timeElapsed = Duration.between(start, Instant.now()).toMillis();
            System.out.printf("time taken: %d ms%n%n", timeElapsed);
        }
    }

    // O(2^n)
    private static long fibonacci(final int n) {
        // fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
        if (n < 2) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // O(n)
    private static long fibonacciTopDown(final int n) {
        return fibonacciTopDownHelper(n, new long[n + 1]);
    }

    private static long fibonacciTopDownHelper(int n, long[] memo) {
        if (n < 2) return n;
        if (memo[n] == 0) {
            memo[n] = fibonacciTopDownHelper(n - 1, memo) + fibonacciTopDownHelper(n - 2, memo);
        }
        return memo[n];
    }

    // O(n)
    private static long fibonacciBottomUp(final int n) {
        if (n < 2) return n;
        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n - 1] + dp[n - 2];
    }


}
