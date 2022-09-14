package com.backstreetbrogrammer.dynamic;

import java.util.Scanner;

/**
 * https://www.hackerearth.com/problem/algorithm/01-knapsack-problem-5a88b815/
 * <p>
 * You are given n  objects, a knapsack of capacity  c, array v, and array w. The ith object has value v[i] and weight w[i].
 * <p>
 * Determine the maximum total value that you can get by selecting objects in such a manner that their sum of weights is not greater than the capacity c.
 */
public class KnapsackProblem {

    //Sample Input:
    //4 20
    //10 2 1 3
    //10 5 10 10
    public static void main(final String[] args) {
        try (final Scanner s = new Scanner(System.in)) {
            final String[] firstInputLine = s.nextLine().split(" ");
            final int totalItems = Integer.parseInt(firstInputLine[0]);
            final int capacity = Integer.parseInt(firstInputLine[1]);

            final String[] secondInputLine = s.nextLine().split(" ");
            final int[] values = new int[totalItems];
            for (int i = 0; i < totalItems; i++) {
                values[i] = Integer.parseInt(secondInputLine[i]);
            }

            final String[] thirdInputLine = s.nextLine().split(" ");
            final int[] weights = new int[totalItems];
            for (int i = 0; i < totalItems; i++) {
                weights[i] = Integer.parseInt(thirdInputLine[i]);
            }

            System.out.println(knapSack(capacity, weights, values, totalItems));
        }
    }

    // Time complexity = O(totalItems * capacity) ~ O(n^2)
    // Space complexity = O(totalItems * capacity) ~ O(n^2)
    private static int knapSack(final int capacity, final int[] weights, final int[] values, final int totalItems) {
        final int[][] dp = new int[totalItems + 1][capacity + 1];
        for (int i = 1; i <= totalItems; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (weights[i - 1] <= j) {
                    // Maximum value that can be obtained from ‘n’ items is the max of the following two values:
                    //   - Maximum value obtained by n-1 items and W weight (excluding nth item).
                    //   - Value of nth item plus maximum value obtained by n-1 items and W minus the weight of the nth item (including nth item).
                    dp[i][j] = Math.max(dp[i - 1][j], values[i - 1] + dp[i - 1][j - weights[i - 1]]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[totalItems][capacity];
    }

    // space optimized - O(n)
    private static int knapSackSpaceOptimized(final int capacity, final int[] weights, final int[] values, final int totalItems) {
        final int[] dp = new int[capacity + 1];
        for (int i = 1; i < totalItems + 1; i++) {
            for (int j = capacity; j >= 0; j--) {
                if (weights[i - 1] <= j) {
                    dp[j] = Math.max(dp[j], dp[j - weights[i - 1]] + values[i - 1]);
                }
            }
        }
        return dp[capacity];
    }

}
