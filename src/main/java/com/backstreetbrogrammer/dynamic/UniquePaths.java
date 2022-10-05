package com.backstreetbrogrammer.dynamic;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/unique-paths/
 * <p>
 * There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]).
 * The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
 * The robot can only move either down or right at any point in time.
 * <p>
 * Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
 * The test cases are generated so that the answer will be less than or equal to 2 * 109.
 * <p>
 * Example:
 * Input: m = 3, n = 2
 * Output: 3
 * Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
 * 1. Right -> Down -> Down
 * 2. Down -> Down -> Right
 * 3. Down -> Right -> Down
 */
public class UniquePaths {

    public static void main(final String[] args) {
        System.out.println(uniquePaths(3, 7));
        System.out.println(uniquePaths(3, 2));
    }

    // Time complexity: O(m*n)
    // Space complexity: O(n)
    private static int uniquePaths(final int m, final int n) {
        int[] row = new int[n];
        Arrays.fill(row, 1);

        for (int i = 0; i < m - 1; i++) {
            final int[] nextRow = new int[n];
            Arrays.fill(nextRow, 1); // last column is 1

            for (int j = n - 2; j >= 0; j--) {
                nextRow[j] = nextRow[j + 1] + row[j];
            }
            row = nextRow;
        }
        return row[0];
    }

}
