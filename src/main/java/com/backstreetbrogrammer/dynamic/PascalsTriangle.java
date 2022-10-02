package com.backstreetbrogrammer.dynamic;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/pascals-triangle/
 * <p>
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * In Pascal's triangle, each number is the sum of the two numbers directly above.
 * <p>
 * Example:
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */
public class PascalsTriangle {

    public static void main(String[] args) {
        final List<List<Integer>> pascalsTriangle = generate(5);
        pascalsTriangle.forEach(row -> {
            row.forEach(num -> System.out.printf("%d, ", num));
            System.out.println();
        });
    }

    // Time complexity:  O(n^2)
    // Space complexity: O(n^2)
    private static List<List<Integer>> generate(final int numRows) {
        final List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));

        if (numRows == 1) return result;

        for (int i = 1; i < numRows; i++) {
            final List<Integer> tmp = new ArrayList<>(result.get(i - 1));
            tmp.add(0); // append 0
            tmp.add(0, 0); // prefix with 0

            final List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= result.get(i - 1).size(); j++) {
                row.add(tmp.get(j) + tmp.get(j + 1));
            }
            result.add(row);
        }

        return result;
    }
}
