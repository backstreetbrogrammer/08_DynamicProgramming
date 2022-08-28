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

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String[] firstInputLine = s.nextLine().split(" ");
            int totalItems = Integer.parseInt(firstInputLine[0]);
            int capacity = Integer.parseInt(firstInputLine[1]);

            String[] secondInputLine = s.nextLine().split(" ");
            int[] values = new int[totalItems];
            for (int i = 0; i < totalItems; i++) {
                values[i] = Integer.parseInt(secondInputLine[i]);
            }

            String[] thirdInputLine = s.nextLine().split(" ");
            int[] weights = new int[totalItems];
            for (int i = 0; i < totalItems; i++) {
                weights[i] = Integer.parseInt(thirdInputLine[i]);
            }

            System.out.println(knapSack(capacity, weights, values, totalItems));
        }
    }

    private static int knapSack(int capacity, int[] weights, int[] values, int totalItems) {
        int[] dp = new int[capacity + 1];
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
