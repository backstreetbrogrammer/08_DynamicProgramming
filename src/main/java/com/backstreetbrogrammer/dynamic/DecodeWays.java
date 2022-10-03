package com.backstreetbrogrammer.dynamic;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/decode-ways/
 * <p>
 * A message containing letters from A-Z can be encoded into numbers using the following mapping:
 * <p>
 * 'A' -> "1"
 * 'B' -> "2"
 * ...
 * 'Z' -> "26"
 * To decode an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the mapping above (there may be multiple ways).
 * For example, "11106" can be mapped into:
 * <p>
 * "AAJF" with the grouping (1 1 10 6)
 * "KJF" with the grouping (11 10 6)
 * Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different from "06".
 * <p>
 * Given a string s containing only digits, return the number of ways to decode it.
 * <p>
 * Example:
 * Input: s = "12"
 * Output: 2
 * Explanation: "12" could be decoded as "AB" (1 2) or "L" (12).
 */
public class DecodeWays {
    public static void main(final String[] args) {
        System.out.println(numDecodings("12"));
    }

    // Time complexity: O(n)
    // Space complexity: O(n)
    private static int numDecodings(final String s) {
        final Map<Integer, Integer> dp = new HashMap<>();
        dp.put(s.length(), 1);

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                dp.put(i, 0);
            } else {
                dp.put(i, dp.get(i + 1));
            }

            if ((i + 1) < s.length() &&
                    (s.charAt(i) == '1' ||
                            (s.charAt(i) == '2' && (s.charAt(i + 1) == '0' ||
                                    s.charAt(i + 1) == '1' ||
                                    s.charAt(i + 1) == '2' ||
                                    s.charAt(i + 1) == '3' ||
                                    s.charAt(i + 1) == '4' ||
                                    s.charAt(i + 1) == '5' ||
                                    s.charAt(i + 1) == '6')))) {
                final int dpI = dp.get(i);
                final int dpIPlus2 = dp.get(i + 2);
                dp.put(i, dpI + dpIPlus2);
            }
        }
        return dp.get(0);
    }
}
