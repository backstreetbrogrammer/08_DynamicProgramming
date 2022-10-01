package com.backstreetbrogrammer.dynamic;

/**
 * https://www.lintcode.com/problem/515/
 * <p>
 * There are a row of n houses, each house can be painted with one of the three colors: red, blue or green.
 * The cost of painting each house with a certain color is different.
 * You have to paint all the houses such that no two adjacent houses have the same color, and you need to cost the least.
 * Return the minimum cost.
 * <p>
 * The cost of painting each house with a certain color is represented by a n x 3 cost matrix.
 * For example, costs[0][0] is the cost of painting house 0 with color red;
 * costs[1][2] is the cost of painting house 1 with color green, and so on...
 * Find the minimum cost to paint all houses.
 * <p>
 * Example:
 * Input: [[14,2,11],[11,14,5],[14,3,10]]
 * Output: 10
 * Explanation: Paint house 0 into blue, paint house 1 into green, paint house 2 into blue. Minimum cost: 2 + 5 + 3 = 10.
 */
public class PaintHouse {

    public static void main(String[] args) {
        final int[][] costs = {{14, 2, 11}, {11, 14, 5}, {14, 3, 10}};
        System.out.println(minCost(costs));
    }

    // Time complexity: O(n)
    // Space complexity: O(n)
    private static int minCost(final int[][] costs) {
        final int[] dp = new int[3];

        for (final int[] cost : costs) {
            int dp0 = cost[0] + Math.min(dp[1], dp[2]);
            int dp1 = cost[1] + Math.min(dp[0], dp[2]);
            int dp2 = cost[2] + Math.min(dp[0], dp[1]);

            dp[0] = dp0;
            dp[1] = dp1;
            dp[2] = dp2;
        }
        return Math.min(dp[0], Math.min(dp[1], dp[2]));
    }

}
