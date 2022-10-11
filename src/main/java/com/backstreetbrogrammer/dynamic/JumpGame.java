package com.backstreetbrogrammer.dynamic;

/**
 * https://leetcode.com/problems/jump-game/
 * <p>
 * You are given an integer array nums. You are initially positioned at the array's first index,
 * and each element in the array represents your maximum jump length at that position.
 * <p>
 * Return true if you can reach the last index, or false otherwise.
 * <p>
 * Example:
 * Input: nums = [2,3,1,1,4]
 * Output: true
 * Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
 */
public class JumpGame {

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(canJump(new int[]{3, 2, 1, 0, 4}));
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    private static boolean canJump(final int[] nums) {
        int target = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if ((i + nums[i]) >= target) {
                target = i;
            }
        }

        return target == 0;
    }
}
