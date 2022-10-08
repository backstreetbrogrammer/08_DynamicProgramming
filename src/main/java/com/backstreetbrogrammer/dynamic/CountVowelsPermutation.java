package com.backstreetbrogrammer.dynamic;

/**
 * https://leetcode.com/problems/count-vowels-permutation/
 * <p>
 * Given an integer n, your task is to count how many strings of length n can be formed under the following rules:
 * <p>
 * Each character is a lower case vowel ('a', 'e', 'i', 'o', 'u')
 * Each vowel 'a' may only be followed by an 'e'.
 * Each vowel 'e' may only be followed by an 'a' or an 'i'.
 * Each vowel 'i' may not be followed by another 'i'.
 * Each vowel 'o' may only be followed by an 'i' or a 'u'.
 * Each vowel 'u' may only be followed by an 'a'.
 * <p>
 * Example:
 * Input: n = 2
 * Output: 10
 * Explanation: All possible strings are: "ae", "ea", "ei", "ia", "ie", "io", "iu", "oi", "ou" and "ua".
 */
public class CountVowelsPermutation {

    public static void main(final String[] args) {
        System.out.println(countVowelPermutation(2));
        System.out.println(countVowelPermutation(5));
        System.out.println(countVowelPermutationSpaceOptimized(5));
    }

    // Time complexity: O(n)
    // Space complexity: O(n^2)
    private static int countVowelPermutation(final int n) {
        if (n == 1) return 5;

        final String vowels = "aeiou";
        final double mod = Math.pow(10, 9) + 7;

        final double[][] dp = new double[n + 1][vowels.length()];
        for (int i = 0; i < vowels.length(); i++) {
            dp[1][i] = 1;
        }

        for (int j = 2; j <= n; j++) {
            dp[j][vowels.indexOf("a")] = (dp[j - 1][vowels.indexOf("e")] + dp[j - 1][vowels.indexOf("i")] + dp[j - 1][vowels.indexOf("u")]) % mod;
            dp[j][vowels.indexOf("e")] = (dp[j - 1][vowels.indexOf("a")] + dp[j - 1][vowels.indexOf("i")]) % mod;
            dp[j][vowels.indexOf("i")] = (dp[j - 1][vowels.indexOf("e")] + dp[j - 1][vowels.indexOf("o")]) % mod;
            dp[j][vowels.indexOf("o")] = dp[j - 1][vowels.indexOf("i")];
            dp[j][vowels.indexOf("u")] = (dp[j - 1][vowels.indexOf("i")] + dp[j - 1][vowels.indexOf("o")]) % mod;
        }

        double result = 0;
        for (final double dpI : dp[n]) {
            result = (result + dpI) % mod;
        }

        return (int) result;
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    private static int countVowelPermutationSpaceOptimized(final int n) {
        if (n == 1) return 5;

        long a = 1, e = 1, i = 1, o = 1, u = 1;
        final long mod = (long) (Math.pow(10, 9) + 7);
        long a2, e2, i2, o2, u2;

        for (int j = 2; j <= n; j++) {
            a2 = (e + i + u) % mod;
            e2 = (a + i) % mod;
            i2 = (e + o) % mod;
            o2 = i;
            u2 = (o + i) % mod;

            a = a2;
            e = e2;
            i = i2;
            o = o2;
            u = u2;
        }

        long result = 0L;
        result = (result + a) % mod;
        result = (result + e) % mod;
        result = (result + i) % mod;
        result = (result + o) % mod;
        result = (result + u) % mod;

        return (int) result;
    }

}
