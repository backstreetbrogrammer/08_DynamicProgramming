package com.backstreetbrogrammer.dynamic;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/coin-change/
 * <p>
 * You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
 * <p>
 * Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 * <p>
 * You may assume that you have an infinite number of each kind of coin.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: coins = [1,2,5], amount = 11
 * Output: 3
 * Explanation: 11 = 5 + 5 + 1
 */
public class CoinChange {

    public static void main(final String[] args) {
        System.out.println(coinChange(new int[]{1, 2, 5}, 11));
    }

    // Time complexity: O(amount * coins.length) ~ O(n^2)
    // Space complexity: O(amount) ~ O(n)
    private static int coinChange(final int[] coins, final int amount) {
        final int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);

        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (final int coin : coins) {
                final int change = i - coin;
                if (change >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[change]);
                }
            }
        }

        return (dp[amount] != amount + 1) ? dp[amount] : -1;
    }
}
