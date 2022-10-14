package com.backstreetbrogrammer.dynamic;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/house-robber-ii/
 * <p>
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed.
 * All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one.
 * Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <p>
 * Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 * <p>
 * Example:
 * <p>
 * Input: nums = [2,3,2]
 * Output: 3
 * Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
 */
public class HouseRobberII {

    public static void main(final String[] args) {
        System.out.println(rob(new int[]{2, 3, 2}));
        System.out.println(rob(new int[]{1, 2, 3, 1}));
    }

    private static int rob(final int[] nums) {
        if (nums.length == 1) return nums[0];

        return Math.max(rob1(Arrays.copyOfRange(nums, 0, nums.length - 1)),
                rob1(Arrays.copyOfRange(nums, 1, nums.length)));
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    private static int rob1(final int[] nums) {
        int house1 = 0;
        int house2 = 0;

        for (final int num : nums) {
            final int tmp = Math.max(num + house1, house2);
            house1 = house2;
            house2 = tmp;
        }

        return house2;
    }

    // Time complexity: O(n)
    // Space complexity: O(n)
    private static int rob2(final int[] nums) {
        if (nums.length == 1) return nums[0];

        final int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[1], dp[0]);

        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }

        return dp[nums.length - 1];
    }
}
