package com.backstreetbrogrammer.dynamic;

/**
 * https://leetcode.com/problems/jump-game-ii/
 * <p>
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
 * <p>
 * Each element nums[i] represents the maximum length of a forward jump from index i.
 * In other words, if you are at nums[i], you can jump to any nums[i + j] where:
 * <p>
 * 0 <= j <= nums[i] and
 * i + j < n
 * <p>
 * Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
 * <p>
 * Example:
 * <p>
 * Input: nums = [2,3,1,1,4]
 * Output: 2
 * Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
 */
public class JumpGameII {

    public static void main(final String[] args) {
        System.out.println(jump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(jump(new int[]{2, 3, 0, 1, 4}));
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    private static int jump(final int[] nums) {
        int level = 0;
        int leftPointer = 0;
        int rightPointer = 0;

        while (rightPointer < (nums.length - 1)) {
            int farthest = 0;
            for (int i = leftPointer; i <= rightPointer; i++) {
                farthest = Math.max(farthest, i + nums[i]);
            }
            leftPointer = rightPointer + 1;
            rightPointer = farthest;
            level++;
        }
        return level;
    }

}
