## Project 8 - Solve Dynamic Programming problems

> Dynamic Programming is mainly an optimization over plain recursion. Wherever we see a recursive solution that has repeated calls for same inputs, we can optimize it using Dynamic Programming. The idea is to simply store the results of subproblems, so that we do not have to re-compute them when needed later. This simple optimization reduces time complexities from exponential to polynomial or linear.

For example, if we write simple recursive solution for Fibonacci Numbers, we get exponential time complexity and if we optimize it by storing solutions of subproblems, time complexity reduces to linear.

Through this series of tutorials, we will solve most popular dynamic programming problems using the most intuitive way possible.

### Popular problems
1. Longest Common Subsequence
   : Given two sequences, find the length of the longest subsequence present in both of them. A subsequence is a sequence that appears in the same relative order, but not necessarily contiguous. 

For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”.

2. Longest Increasing Subsequence
   : The Longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a given sequence such that all elements of the subsequence are sorted in increasing order. 

For example, the length of LIS for {10, 22, 9, 33, 21, 50, 41, 60, 80} is 6 and LIS is {10, 22, 33, 50, 60, 80}.

3. Edit distance or Levenshtein distance
   : Given two strings str1 and str2 and operations that can be performed on str1. Find minimum number of edits (operations) required to convert ‘str1’ into ‘str2’. Insert, Remove, Replace - all the operations are of equal cost.

For example, 
Input:   str1 = “sunday”, str2 = “saturday”
Output:  3
Explanation: Last three and first characters are same.  We basically need to convert “un” to “atur”.  This can be done using below three operations. Replace ‘n’ with ‘r’, insert t, insert a

4. 0-1 Knapsack Problem
   : Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum total value in the knapsack. In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and weights associated with n items respectively. Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of the weights of this subset is smaller than or equal to W. You cannot break an item, either pick the complete item or don’t pick it (0-1 property).


5. Shortest Common Supersequence
   : Given two strings str1 and str2, the task is to find the length of the shortest string that has both str1 and str2 as subsequences. 

For example, 
Input:   str1 = "geek",  str2 = "eke"
Output: 5
Explanation:
String "geeke" has both string "geek" and "eke" as subsequences.


6. Matrix Chain Multiplication
   : Given the dimension of a sequence of matrices in an array arr[], where the dimension of the ith matrix is (arr[i-1] * arr[i]), the task is to find the most efficient way to multiply these matrices together such that the total number of element multiplications is minimum.

For example,
Input: arr[] = {40, 20, 30, 10, 30}
Output: 26000
Explanation:There are 4 matrices of dimensions 40×20, 20×30, 30×10, 10×30.
Let the input 4 matrices be A, B, C and D.
The minimum number of  multiplications are obtained by
putting parenthesis in following way (A(BC))D.
The minimum is 20 x 30 x 10 + 40 x 20 x 10 + 40 x 10 x 30

7. Partition problem
   : Partition problem is to determine whether a given set can be partitioned into two subsets such that the sum of elements in both subsets is the same.

For example,
arr[] = {1, 5, 11, 5}
Output: true
The array can be partitioned as {1, 5, 5} and {11}

8. Rod Cutting
   : Given a rod of length n inches and an array of prices that includes prices of all pieces of size smaller than n. Determine the maximum value obtainable by cutting up the rod and selling the pieces. For example, if the length of the rod is 8 and the values of different pieces are given as the following, then the maximum obtainable value is 22 (by cutting in two pieces of lengths 2 and 6)

   
9. Coin change problem
   : Given a value sum, if we want to make change for sum cents, and we have an infinite supply of each of coins[] = { coins1, coins2, .. , coinsn} valued coins, how many ways can we make the change? The order of coins doesn’t matter.

Examples:

Input: sum = 4, coins[] = {1,2,3},
Output: 4
Explanation: there are four solutions: {1, 1, 1, 1}, {1, 1, 2}, {2, 2}, {1, 3}.


10. Word Break Problem
   : Given an input string and a dictionary of words, find out if the input string can be segmented into a space-separated sequence of dictionary words.

Consider the following dictionary
{ i, like, sam, sung, samsung, mobile, ice,
cream, icecream, man, go, mango}

Input:  ilike
Output: Yes
The string can be segmented as "i like".


11. Boolean Parenthesization Problem
    : Given a boolean expression with the following symbols.

Symbols
'T' ---> true
'F' ---> false
And following operators filled between symbols

Operators
&   ---> boolean AND
|   ---> boolean OR
^   ---> boolean XOR
Count the number of ways we can parenthesize the expression so that the value of expression evaluates to true.
Let the input be in form of two arrays one contains the symbols (T and F) in order and the other contains operators (&, | and ^}
