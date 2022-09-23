package com.backstreetbrogrammer.dynamic;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/counting-bits/
 * <p>
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
 * <p>
 * Example:
 * <p>
 * Input: n = 2
 * Output: [0,1,1]
 * Explanation:
 * 0 --> 0
 * 1 --> 1
 * 2 --> 10
 */
public class CountingBits {

    public static void main(String[] args) {
        final int[] res1 = countBits(5);
        Arrays.stream(res1)
                .forEach(num -> System.out.printf("%d, ", num));
    }

    // Time complexity: O(n)
    // Space complexity: O(n)
    private static int[] countBits(final int n) {
        if (n == 0) return new int[]{0};

        final int[] dp = new int[n + 1];
        int offset = 1;

        for (int i = 1; i < n + 1; i++) {
            if ((offset * 2) == i) {
                offset = i;
            }
            dp[i] = 1 + dp[i - offset];
        }
        return dp;
    }
}
