package com.backstreetbrogrammer.dynamic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/partition-equal-subset-sum/
 * <p>
 * Given a non-empty array nums containing only positive integers, find if the array can be partitioned into two subsets
 * such that the sum of elements in both subsets is equal.
 * <p>
 * Example:
 * Input: nums = [1,5,11,5]
 * Output: true
 * Explanation: The array can be partitioned as [1, 5, 5] and [11].
 */
public class PartitionEqualSubsetSum {

    public static void main(final String[] args) {
        System.out.println(canPartition(new int[]{1, 5, 11, 5}));
        System.out.println(canPartition(new int[]{1, 2, 3, 5}));
    }

    // Time complexity:  O(n^2)
    // Space complexity: O(sum(nums[])^2) ~ O(n^2)
    private static boolean canPartition(final int[] nums) {
        if (nums.length == 1) return false;

        final int sum = Arrays.stream(nums)
                              .sum();

        if (sum % 2 == 1) return false; // if sum is odd, return false

        final Set<Integer> dp = new HashSet<>();
        dp.add(0);

        final int target = sum / 2;
        for (final int num : nums) {
            final Set<Integer> nextDP = new HashSet<>();
            for (final int dpNum : dp) {
                final int currSum = dpNum + num;
                if (currSum == target) {
                    return true;
                }
                nextDP.add(currSum);
                nextDP.add(dpNum);
            }
            dp.addAll(nextDP);
        }

        return dp.contains(target);
    }

}
