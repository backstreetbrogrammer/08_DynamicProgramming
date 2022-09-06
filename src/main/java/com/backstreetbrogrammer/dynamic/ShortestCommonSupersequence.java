package com.backstreetbrogrammer.dynamic;

/**
 * https://leetcode.com/problems/shortest-common-supersequence/
 * <p>
 * Given two strings str1 and str2, return the shortest string that has both str1 and str2 as subsequences. If there are multiple valid strings, return any of them.
 * <p>
 * A string s is a subsequence of string t if deleting some number of characters from t (possibly 0) results in the string s.
 * <p>
 * <p>
 * <p>
 * Example:
 * <p>
 * Input: str1 = "abac", str2 = "cab"
 * Output: "cabac"
 * Explanation:
 * str1 = "abac" is a subsequence of "cabac" because we can delete the first "c".
 * str2 = "cab" is a subsequence of "cabac" because we can delete the last "ac".
 * The answer provided is the shortest such string that satisfies these properties.
 */
public class ShortestCommonSupersequence {

    public static void main(String[] args) {
        System.out.println(shortestCommonSupersequence("abac", "cab"));
        System.out.println(shortestCommonSupersequence("aggtab", "gxtxayb"));
    }

    private static String shortestCommonSupersequence(final String str1, final String str2) {
        final int row = str1.length();
        final int col = str2.length();

        final int[][] dp = new int[row + 1][col + 1];
        for (int i = row - 1; i >= 0; i--) {
            for (int j = col - 1; j >= 0; j--) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    dp[i][j] = 1 + dp[i + 1][j + 1];
                } else {
                    dp[i][j] = Math.max(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }

        final StringBuilder sb = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < row && j < col) {
            if (str1.charAt(i) == str2.charAt(j)) {
                sb.append(str1.charAt(i));
                i++;
                j++;
            } else if (dp[i + 1][j] > dp[i][j + 1]) {
                sb.append(str1.charAt(i));
                i++;
            } else {
                sb.append(str2.charAt(j));
                j++;
            }
        }

        while (i < row) {
            sb.append(str1.charAt(i));
            i++;
        }

        while (j < col) {
            sb.append(str2.charAt(j));
            j++;
        }

        return sb.toString();
    }

}
