package com.backstreetbrogrammer.dynamic;

/**
 * https://www.codingninjas.com/codestudio/problems/rod-cutting-problem_800284
 * <p>
 * Given a rod of length n inches and an array of prices that includes prices of all pieces of size smaller than n.
 * Determine the maximum value obtainable by cutting up the rod and selling the pieces.
 * <p>
 * For example, if the length of the rod is 8 and the values of different pieces are given as the following,
 * then the maximum obtainable value is 22 (by cutting in two pieces of lengths 2 and 6)
 * <p>
 * length   | 1   2   3   4   5   6   7   8
 * --------------------------------------------
 * price    | 1   5   8   9  10  17  17  20
 */
public class RodCutting {

    public static void main(String[] args) {
        System.out.println(cutRod(new int[]{1, 5, 8, 9, 10, 17, 17, 20}, 8));
    }

    private static int cutRod(final int price[], final int n) {
        final int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int maxVal = Integer.MIN_VALUE;
            for (int j = 0; j < i; j++) {
                maxVal = Math.max(maxVal, price[j] + dp[i - j - 1]);
            }
            dp[i] = maxVal;
        }

        return dp[n];
    }
}
