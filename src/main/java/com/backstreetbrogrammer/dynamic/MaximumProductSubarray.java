package com.backstreetbrogrammer.dynamic;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/maximum-product-subarray/
 * <p>
 * Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
 * The test cases are generated so that the answer will fit in a 32-bit integer.
 * A subarray is a contiguous subsequence of the array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] has the largest product 6.
 */
public class MaximumProductSubarray {

    public static void main(final String[] args) {
        System.out.println(maxProduct(new int[]{2, 3, -2, 4}));
        System.out.println(maxProduct(new int[]{-2, 0, -1}));
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    private static int maxProduct(final int[] nums) {
        if (nums.length == 1) return nums[0];

        int result = Arrays.stream(nums)
                .max()
                .getAsInt();

        int currMin = 1;
        int currMax = 1;

        for (final int num : nums) {
            final int tmp = currMax * num;
            currMax = Math.max(num * currMax, Math.max(num * currMin, num));
            currMin = Math.min(tmp, Math.min(num * currMin, num));
            result = Math.max(result, currMax);
        }

        return result;
    }

}
