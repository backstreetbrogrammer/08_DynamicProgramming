package com.backstreetbrogrammer.dynamic;

/**
 * https://leetcode.com/problems/super-egg-drop/
 * <p>
 * You are given k identical eggs and you have access to a building with n floors labeled from 1 to n.
 * <p>
 * You know that there exists a floor f where 0 <= f <= n such that any egg dropped at a floor higher than f will break,
 * and any egg dropped at or below floor f will not break.
 * <p>
 * Each move, you may take an unbroken egg and drop it from any floor x (where 1 <= x <= n).
 * If the egg breaks, you can no longer use it. However, if the egg does not break, you may reuse it in future moves.
 * <p>
 * Return the minimum number of moves that you need to determine with certainty what the value of f is.
 * <p>
 * Example 1:
 * <p>
 * Input: k = 1, n = 2
 * Output: 2
 * Explanation:
 * Drop the egg from floor 1. If it breaks, we know that f = 0.
 * Otherwise, drop the egg from floor 2. If it breaks, we know that f = 1.
 * If it does not break, then we know f = 2.
 * Hence, we need at minimum 2 moves to determine with certainty what the value of f is.
 */
public class SuperEggDrop {
    public static void main(final String[] args) {
        System.out.println(superEggDrop(1, 2));
        System.out.println(superEggDrop(2, 6));
        System.out.println(superEggDrop(3, 14));
    }

    // Time complexity: O(totalEggs * totalFloors^2) ~ O(k * n^2)
    // Space complexity: O(totalEggs * totalFloors) ~ O(k * n)
    private static int superEggDropSlow(final int k, final int n) { // Time Limit Exceeded
        // k is no of eggs
        // n is no of floors
        final int[][] dp = new int[k + 1][n + 1];

        for (int eggs = 1; eggs <= k; eggs++) {
            dp[eggs][1] = 1;
        }
        for (int floors = 1; floors <= n; floors++) {
            dp[1][floors] = floors;
        }
        for (int eggs = 2; eggs <= k; eggs++) {
            for (int floors = 2; floors <= n; floors++) {
                dp[eggs][floors] = Integer.MAX_VALUE;
                for (int flr = 1; flr <= floors; flr++) {
                    final int moves = 1 + Math.max(dp[eggs - 1][flr - 1], dp[eggs][floors - flr]);
                    if (moves < dp[eggs][floors]) {
                        dp[eggs][floors] = moves;
                    }
                }
            }
        }
        return dp[k][n];
    }

    // Time complexity: O(totalEggs * log(totalFloors)) ~ O(k * log n)
    // Space complexity: O(totalEggs) ~ O(k)
    private static int superEggDrop(final int k, final int n) {
        // k is no of eggs
        // n is no of floors
        final int[] dp = new int[k + 1];
        int moves;

        for (moves = 0; dp[k] < n; moves++) {
            for (int eggs = k; eggs > 0; eggs--) {
                dp[eggs] += (1 + dp[eggs - 1]);
            }
        }
        return moves;
    }
}
