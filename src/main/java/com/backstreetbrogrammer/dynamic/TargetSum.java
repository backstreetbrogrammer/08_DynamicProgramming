package com.backstreetbrogrammer.dynamic;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/target-sum/
 * <p>
 * You are given an integer array nums and an integer target.
 * <p>
 * You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and then concatenate all the integers.
 * <p>
 * For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the expression "+2-1".
 * Return the number of different expressions that you can build, which evaluates to target.
 * <p>
 * Example:
 * <p>
 * Input: nums = [1,1,1,1,1], target = 3
 * Output: 5
 * Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.
 * -1 + 1 + 1 + 1 + 1 = 3
 * +1 - 1 + 1 + 1 + 1 = 3
 * +1 + 1 - 1 + 1 + 1 = 3
 * +1 + 1 + 1 - 1 + 1 = 3
 * +1 + 1 + 1 + 1 - 1 = 3
 */
public class TargetSum {

    public static void main(final String[] args) {
        System.out.println(findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
    }

    private static int findTargetSumWays(final int[] nums, final int target) {
        final Map<String, Integer> memo = new HashMap<>();
        return findTargetSumWays(nums, target, 0, 0, memo);
    }

    private static int findTargetSumWays(final int[] nums,
                                         final int target,
                                         final int index,
                                         final int total,
                                         final Map<String, Integer> memo) {
        if (index == nums.length) {
            return (total == target) ? 1 : 0;
        }

        final String key = index + "~" + total;
        if (!memo.containsKey(key)) {
            final int value =
                    findTargetSumWays(nums, target, index + 1, total + nums[index], memo)
                            + findTargetSumWays(nums, target, index + 1, total - nums[index], memo);
            memo.put(key, value);
        }
        return memo.get(key);
    }

}
