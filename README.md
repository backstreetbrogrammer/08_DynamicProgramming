# Project 8 - Solve Dynamic Programming problems

> Dynamic Programming is mainly an optimization over plain recursion. Wherever we see a recursive solution that has repeated calls for same inputs, we can optimize it using Dynamic Programming. The idea is to simply store the results of subproblems, so that we do not have to re-compute them when needed later. This simple optimization reduces time complexities from exponential to polynomial or linear.

For example, if we write simple recursive solution for Fibonacci Numbers, we get exponential time complexity and if we
optimize it by storing solutions of subproblems, time complexity reduces to linear.

Through this series of tutorials, we will solve most popular dynamic programming problems using the most intuitive way
possible.

#### Youtube

- [01 - Dynamic Programming - Introduction](https://www.youtube.com/watch?v=Hnb6GDFBmQs)
- [02 - Fibonacci Numbers - Recursive](https://www.youtube.com/watch?v=AYMjH6sSbeo)
- [03 - Fibonacci Numbers - Dynamic Programming Top Down Memoization](https://www.youtube.com/watch?v=GVwkuS0PdTY)
- [04 - Fibonacci Numbers - Dynamic Programming Bottom Up](https://www.youtube.com/watch?v=nw8tJ5eP5aI)

#### Leetcode

[Introduction to DP - Fibonacci Numbers](https://leetcode.com/problems/fibonacci-number/)

## Most Popular Problems

### 1. Longest Common Subsequence

Given two sequences, find the length of the longest subsequence present in both of them. A subsequence is a sequence
that appears in the same relative order, but not necessarily contiguous.

For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”.

#### Youtube

- [05 - Longest Common Subsequence - Definition](https://www.youtube.com/watch?v=0z_uic-lge8)
- [06 - Longest Common Subsequence - Recursive approach](https://www.youtube.com/watch?v=218NLh8rG5g)
- [07 - Longest Common Subsequence - Dynamic Programming approach](https://www.youtube.com/watch?v=ZvLvrgwPs1s)
- [08 - Longest Common Subsequence - Final DP solution in Java](https://www.youtube.com/watch?v=uH5x9cXl218)

#### Leetcode

[1143. Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)

### 2. Longest Increasing Subsequence

The Longest Increasing Subsequence (LIS) problem is to find the length of the longest subsequence of a given sequence
such that all elements of the subsequence are sorted in increasing order.

For example, the length of LIS for {10, 22, 9, 33, 21, 50, 41, 60, 80} is 6 and LIS is {10, 22, 33, 50, 60, 80}.

#### Youtube

- [09 - Longest Increasing Subsequence - Definition](https://www.youtube.com/watch?v=xinEAYkOy58)
- [10 - Longest Increasing Subsequence - Dynamic Programming approach](https://www.youtube.com/watch?v=UmJRG6hMyT4)
- [11 - Longest Increasing Subsequence - Final DP solution in Java](https://www.youtube.com/watch?v=yLQcNKVMF_8)

#### Leetcode

[300. Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/)

### 3. Shortest Common Supersequence

Given two strings str1 and str2, the task is to find the length of the shortest string that has both str1 and str2 as
subsequences.

For example, Input:   str1 = "geek", str2 = "eke"
Output: 5 Explanation:
String "geeke" has both string "geek" and "eke" as subsequences.

#### Youtube

- [12 - Shortest Common Supersequence - Definition](https://www.youtube.com/watch?v=l3Asi2MGfAA)
- [13 - Shortest Common Supersequence - Basic approach](https://www.youtube.com/watch?v=-De767mmtds)
- [14 - Shortest Common Supersequence - LCS refresher](https://www.youtube.com/watch?v=cnbnFX7jZxc)
- [15 - Shortest Common Supersequence - Dynamic Programming Approach 1](https://www.youtube.com/watch?v=cTscNRms3Lg)
- [16 - Shortest Common Supersequence - Dynamic Programming Approach 2](https://www.youtube.com/watch?v=Cl5xDDNNEvA)
- [17 - Shortest Common Supersequence - Final DP solution in Java](https://www.youtube.com/watch?v=tVSQ4E91lm4)
- [18 - Shortest Common Supersequence - submit solution in Leetcode](https://www.youtube.com/watch?v=m7KtMCtoDpc)

#### Leetcode

[1092. Shortest Common Supersequence](https://leetcode.com/problems/shortest-common-supersequence/)

### 4. Edit distance or Levenshtein distance

Given two strings str1 and str2 and operations that can be performed on str1. Find minimum number of edits (operations)
required to convert ‘str1’ into ‘str2’. Insert, Remove, Replace - all the operations are of equal cost.

For example, Input:   str1 = “sunday”, str2 = “saturday” Output:  3 Explanation: Last three and first characters are
same. We basically need to convert “un” to “atur”. This can be done using below three operations. Replace ‘n’ with ‘r’,
insert t, insert a

#### Youtube

- [19 - Edit Distance - Definition](https://www.youtube.com/watch?v=AGmwuc_OTfQ)
- [20 - Edit Distance - Basic approach 1](https://www.youtube.com/watch?v=LRdZ12vb9rE)
- [21 - Edit Distance - Basic approach 2](https://www.youtube.com/watch?v=d6SSGL-_L4A)
- [22 - Edit Distance - Dynamic Programming approach](https://www.youtube.com/watch?v=HNeApfHgc9Q)
- [23 - Edit Distance - Final DP solution in Java](https://www.youtube.com/watch?v=MJATOeiiQaw)

#### Leetcode

[72. Edit Distance](https://leetcode.com/problems/edit-distance/)

### 5. Climbing Stairs

You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. In how
many distinct ways can you climb to the top?

Example:
Input: n = 2 Output: 2 Explanation: There are two ways to climb to the top.

1. 1 step + 1 step
2. 2 steps

#### Youtube

- [24 - Climbing Stairs - Definition](https://www.youtube.com/watch?v=m5TTbpx7n4M)
- [25 - Climbing Stairs - Basic approach 1](https://www.youtube.com/watch?v=0rDi0wmT0os)
- [26 - Climbing Stairs - Basic approach 2](https://www.youtube.com/watch?v=7SxNzY-1jMs)
- [27 - Climbing Stairs - Final DP solution in Java](https://www.youtube.com/watch?v=-2mGXCrKNAg)

#### Leetcode

[70. Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)

### 6. Rod Cutting

Given a rod of length n inches and an array of prices that includes prices of all pieces of size smaller than n.
Determine the maximum value obtainable by cutting up the rod and selling the pieces.

For example, if the length of the rod is 8 and the values of different pieces are given as the following, then the
maximum obtainable value is 22 (by cutting in two pieces of lengths 2 and 6)

length | 1 2 3 4 5 6 7 8

price | 1 5 8 9 10 17 17 20

#### Youtube

- [28 - Rod Cutting - Definition](https://www.youtube.com/watch?v=oW58btF_lSg)
- [29 - Rod Cutting - Dynamic Programming approach](https://www.youtube.com/watch?v=IxlaYtY9s5M)
- [30 - Rod Cutting - Final DP solution in Java](https://www.youtube.com/watch?v=JKY6tePuh9A)

#### Coding Ninjas

[Rod cutting problem](https://www.codingninjas.com/codestudio/problems/rod-cutting-problem_800284)

### 7. 0-1 Knapsack Problem

Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum total value in the
knapsack. In other words, given two integer arrays val[0..n-1] and wt[0..n-1] which represent values and weights
associated with n items respectively.

Also given an integer W which represents knapsack capacity, find out the maximum value subset of val[] such that sum of
the weights of this subset is smaller than or equal to W.

You cannot break an item, either pick the complete item or don’t pick it (0-1 property).

#### Youtube

- [31 - Knapsack Problem - Definition](https://www.youtube.com/watch?v=y2rbW-tCrQA)
- [32 - Knapsack Problem - Dynamic Programming approach 1](https://www.youtube.com/watch?v=QUCCV6Nsf-4)
- [33 - Knapsack Problem - Dynamic Programming approach 2](https://www.youtube.com/watch?v=wo_fw05O9OI)
- [34 - Knapsack Problem - Final DP solution in Java](https://www.youtube.com/watch?v=gZX3mCCC3dc)

#### Hacker Earth

[0/1 KNAPSACK PROBLEM](https://www.hackerearth.com/problem/algorithm/01-knapsack-problem-5a88b815/)

### 8. Word Break Problem

Given an input string and a dictionary of words, find out if the input string can be segmented into a space-separated
sequence of dictionary words.

Consider the following dictionary

{ i, like, sam, sung, samsung, mobile, ice, cream, icecream, man, go, mango}

Input:  ilike

Output: Yes

The string can be segmented as "i like".

#### Youtube

- [35 - Word Break - Definition](https://www.youtube.com/watch?v=U-tprFcNO9A)
- [36 - Word Break - Dynamic Programming approach](https://www.youtube.com/watch?v=XDeSrT8y3t8)
- [37 - Word Break - Final DP solution in Java](https://www.youtube.com/watch?v=1x6JnIIl318)

#### Leetcode

[139. Word Break](https://leetcode.com/problems/word-break/)

### 9. Coin change problem

Given a value sum, if we want to make change for sum cents, and we have an infinite supply of each of coins[] = {
coins1, coins2, .. , coinsn} valued coins, how many ways can we make the change? The order of coins doesn’t matter.

Examples:

Input: sum = 4, coins[] = {1,2,3},

Output: 4

Explanation: there are four solutions: {1, 1, 1, 1}, {1, 1, 2}, {2, 2}, {1, 3}.

#### Youtube

- [38 - Coin Change - Definition](https://www.youtube.com/watch?v=emu-XjbEcYk)
- [39 - Coin Change - Dynamic Programming approach 1](https://www.youtube.com/watch?v=kUEyQpf-9z4)
- [40 - Coin Change - Dynamic Programming approach 2](https://www.youtube.com/watch?v=WvQ6ZCxap3I)
- [41 - Coin Change - Final DP solution in Java](https://www.youtube.com/watch?v=KCssoWz1__4)

#### Leetcode

[322. Coin Change](https://leetcode.com/problems/coin-change/)

### 10. House Robber

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and
it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can
rob tonight without alerting the police.

Example:

Input: nums = [1,2,3,1]

Output: 4

Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3). Total amount you can rob = 1 + 3 = 4.

#### Youtube

- [42 - House Robber - Definition](https://www.youtube.com/watch?v=08v6hxP1kQc)
- [43 - House Robber - Dynamic Programming approach](https://www.youtube.com/watch?v=kFOh7DZggpQ)
- [44 - House Robber - Final DP solution in Java](https://www.youtube.com/watch?v=IsaWPoxGJf0)

#### Leetcode

[198. House Robber](https://leetcode.com/problems/house-robber/)

### 11. Maximum Product Subarray

Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and
return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

A subarray is a contiguous subsequence of the array.

Example:

Input: nums = [2,3,-2,4]

Output: 6

Explanation: [2,3] has the largest product 6.

#### Youtube

- [45 - Maximum Product Subarray - Definition](https://www.youtube.com/watch?v=QHeYOTzPwM8)
- [46 - Maximum Product Subarray - Dynamic Programming approach 1](https://www.youtube.com/watch?v=Ix-WH61u77c)
- [47 - Maximum Product Subarray - Dynamic Programming approach 2](https://www.youtube.com/watch?v=7VZYLYDWUVg)
- [48 - Maximum Product Subarray - Dynamic Programming approach 3](https://www.youtube.com/watch?v=WmagZpQslbc)
- [49 - Maximum Product Subarray - Final DP solution in Java](https://www.youtube.com/watch?v=1MzZ8lrzPyo)

#### Leetcode

[152. Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/)

#### 12. Longest Palindromic Substring

Given a string s, return the longest palindromic substring in s.

A string is called a palindrome string if the reverse of that string is the same as the original string.

Example:

Input: s = "babad"

Output: "bab"

Explanation: "aba" is also a valid answer.

#### Youtube
- [50 - Longest Palindromic Substring - Definition](https://www.youtube.com/watch?v=c2rFA-u-EHo)


#### Leetcode

[5. Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)
