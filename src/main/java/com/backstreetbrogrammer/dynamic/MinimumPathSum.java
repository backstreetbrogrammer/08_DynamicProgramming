package com.backstreetbrogrammer.dynamic;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/minimum-path-sum/
 * <p>
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.
 * Note: You can only move either down or right at any point in time.
 * <p>
 * Example:
 * Input: grid = [[1,3,1],[1,5,1],[4,2,1]]
 * Output: 7
 * Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.
 */
public class MinimumPathSum {

    public static void main(final String[] args) {
        final int[][] grid = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(minPathSum(grid));
        System.out.println(minPathSumSpaceOptimised(grid));
    }

    // Time complexity: O(m*n)
    // Space complexity: O(m*n)
    private static int minPathSum(final int[][] grid) {
        final int rows = grid.length;
        final int cols = grid[0].length;

        final int[][] dp = new int[rows + 1][cols + 1];

        for (int i = 0; i <= rows; i++) {
            dp[i][cols] = Integer.MAX_VALUE;
        }
        for (int i = 0; i <= cols; i++) {
            dp[rows][i] = Integer.MAX_VALUE;
        }

        dp[rows][cols - 1] = 0; // base condition

        for (int row = rows - 1; row >= 0; row--) {
            for (int col = cols - 1; col >= 0; col--) {
                dp[row][col] = grid[row][col] + Math.min(dp[row + 1][col], dp[row][col + 1]);
            }
        }
        return dp[0][0];
    }

    // Time complexity: O(m*n)
    // Space complexity: O(n)
    private static int minPathSumSpaceOptimised(final int[][] grid) {
        final int rows = grid.length;
        final int cols = grid[0].length;

        int[] row = new int[cols + 1];
        Arrays.fill(row, Integer.MAX_VALUE);
        row[cols - 1] = 0; // base condition

        for (int i = rows - 1; i >= 0; i--) {
            final int[] nextRow = new int[cols + 1];
            nextRow[cols] = Integer.MAX_VALUE;
            for (int j = cols - 1; j >= 0; j--) {
                nextRow[j] = grid[i][j] + Math.min(row[j], nextRow[j + 1]);
            }
            row = nextRow;
        }
        return row[0];
    }

}
