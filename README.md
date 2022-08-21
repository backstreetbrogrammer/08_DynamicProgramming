## Project 8 - Solve Dynamic Programming problems

> Dynamic Programming is mainly an optimization over plain recursion. Wherever we see a recursive solution that has repeated calls for same inputs, we can optimize it using Dynamic Programming. The idea is to simply store the results of subproblems, so that we do not have to re-compute them when needed later. This simple optimization reduces time complexities from exponential to polynomial.

For example, if we write simple recursive solution for Fibonacci Numbers, we get exponential time complexity and if we optimize it by storing solutions of subproblems, time complexity reduces to linear.

Through this series of tutorials, we will solve hundreds of dynamic programming problems using the most intuitive way possible.

#### Top 20 problems
1. Longest Common Subsequence
   : Given two sequences, find the length of longest subsequence present in both of them. A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous. For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”.
2. Longest Increasing Subsequence
   : The Longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a given sequence such that all elements of the subsequence are sorted in increasing order. For example, the length of LIS for {10, 22, 9, 33, 21, 50, 41, 60, 80} is 6 and LIS is {10, 22, 33, 50, 60, 80}.

#### Basic problems
1. Ugly numbers
   : Ugly numbers are numbers whose only prime factors are 2, 3 or 5. The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers. By convention, 1 is included.
   Given a number n, the task is to find n’th Ugly number.
2. Fibonacci numbers
   : The Fibonacci numbers are the numbers in the following integer sequence.
   0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …… In mathematical terms, the sequence Fn of Fibonacci numbers is defined by the recurrence relation
   Fn = Fn-1 + Fn-2 with seed values F0 = 0 and F1 = 1.
