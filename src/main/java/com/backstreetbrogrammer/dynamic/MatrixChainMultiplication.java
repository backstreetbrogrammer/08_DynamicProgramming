package com.backstreetbrogrammer.dynamic;

import java.util.Scanner;

/**
 * https://www.codingninjas.com/codestudio/problems/matrix-chain-multiplication_975344
 * <p>
 * Given the dimension of a sequence of matrices in an array arr[], where the dimension of the ith matrix is (arr[i-1] *
 * arr[i]), the task is to find the most efficient way to multiply these matrices together such that the total number of
 * element multiplications is minimum.
 * <p>
 * Example:
 * <p>
 * Input: arr[] = {40, 20, 30, 10, 30}
 * <p>
 * Output: 26000
 * <p>
 * Explanation:There are 4 matrices of dimensions 40×20, 20×30, 30×10, 10×30. Let the input 4 matrices be A, B, C and D.
 * The minimum number of multiplications are obtained by putting parenthesis in following way (A(BC))D.
 * <p>
 * The minimum is 20 x 30 x 10 + 40 x 20 x 10 + 40 x 10 x 30
 */
public class MatrixChainMultiplication {

    // Sample Input:
    // 1
    // 4
    // 1 4 3 2
    public static void main(final String[] args) {
        // System.out.println(matrixMultiplication(new int[]{40, 20, 30, 10, 30}, 5));
        // System.out.println(matrixMultiplication(new int[]{1, 2, 3, 4, 3}, 5));

        try (final Scanner s = new Scanner(System.in)) {
            final int T = Integer.parseInt(s.nextLine());
            for (int i = 0; i < T; i++) {
                final int N = Integer.parseInt(s.nextLine());
                final String[] matricesLine = s.nextLine().split(" ");
                final int[] matrixElements = new int[matricesLine.length];
                for (int j = 0; j < matricesLine.length; j++) {
                    matrixElements[j] = Integer.parseInt(matricesLine[j]);
                }
                System.out.println(matrixMultiplication(matrixElements, N));
            }
        }

    }

    // Time complexity: O(N^3)
    // Space complexity: O(N^2)
    private static int matrixMultiplication(final int[] arr, final int N) {
        final int[][] dp = new int[N][N];
        for (int len = 2; len < N; len++) {
            for (int i = 0; i < N - len; i++) {
                final int j = i + len;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; k++) {
                    final int cost = dp[i][k] + dp[k][j] + (arr[i] * arr[k] * arr[j]);
                    if (cost < dp[i][j]) {
                        dp[i][j] = cost;
                    }
                }
            }
        }

        return dp[0][N - 1];
    }
}
