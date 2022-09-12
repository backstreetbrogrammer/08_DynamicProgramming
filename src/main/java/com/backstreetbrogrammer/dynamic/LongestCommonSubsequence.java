package com.backstreetbrogrammer.dynamic;

/**
 * https://leetcode.com/problems/longest-common-subsequence/
 * <p>
 * Given two strings text1 and text2, return the length of their longest common subsequence.
 * If there is no common subsequence, return 0.
 * <p>
 * A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted
 * without changing the relative order of the remaining characters.
 * <p>
 * For example, "ace" is a subsequence of "abcde".
 * A common subsequence of two strings is a subsequence that is common to both strings.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: text1 = "abcde", text2 = "ace"
 * Output: 3
 * Explanation: The longest common subsequence is "ace" and its length is 3.
 */
public class LongestCommonSubsequence {

    public static void main(final String[] args) {
        System.out.println(longestCommonSubsequence("abcde", "ace"));
    }

    // Time complexity: O(text1.length * text2.length) ~ O(n^2)
    // Space complexity: O(text1.length * text2.length) ~ O(n^2)
    private static int longestCommonSubsequence(final String text1, final String text2) {
        final int row = text1.length();
        final int col = text2.length();

        final int[][] dp = new int[row + 1][col + 1];
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                if (text1.charAt(i) == text2.charAt(j)) {
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }
        return dp[0][0];
    }

}
