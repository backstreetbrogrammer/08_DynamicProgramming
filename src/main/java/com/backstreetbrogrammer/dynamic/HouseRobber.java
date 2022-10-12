package com.backstreetbrogrammer.dynamic;

/**
 * https://leetcode.com/problems/house-robber/
 *
 * <p>
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
 * the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and
 * it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <p>
 * Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount you can rob = 1 + 3 = 4.
 */
public class HouseRobber {

    public static void main(final String[] args) {
        System.out.println(rob(new int[]{1, 2, 3, 1}));
        System.out.println(robSpaceOptimized(new int[]{2, 7, 9, 3, 1}));
    }

    // Time complexity: O(n)
    // Space complexity: O(n)
    private static int rob(final int[] nums) {
        if (nums.length == 1) return nums[0];

        final int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], dp[0]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }

        return dp[nums.length - 1];
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    private static int robSpaceOptimized(final int[] nums) {
        int house1 = 0;
        int house2 = 0;

        for (final int num : nums) {
            final int tmp = Math.max(num + house1, house2);
            house1 = house2;
            house2 = tmp;
        }

        return house2;
    }
}
