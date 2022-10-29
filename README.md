# Project 8 - Solve Dynamic Programming problems

> Dynamic Programming is mainly an optimization over plain recursion. Wherever we see a recursive solution that has repeated calls for same inputs, we can optimize it using Dynamic Programming. The idea is to simply store the results of subproblems, so that we do not have to re-compute them when needed later. This simple optimization reduces time complexities from exponential to polynomial or linear.

For example, if we write simple recursive solution for Fibonacci Numbers, we get exponential time complexity and if we
optimize it by storing solutions of subproblems, time complexity reduces to linear.

Through this series of tutorials, we will solve most popular dynamic programming problems using the most intuitive way
possible.

#### Youtube

- [01 - Dynamic Programming - Introduction](https://youtu.be/Hnb6GDFBmQs)
- [02 - Fibonacci Numbers - Recursive](https://youtu.be/AYMjH6sSbeo)
- [03 - Fibonacci Numbers - Dynamic Programming Top Down Memoization](https://youtu.be/GVwkuS0PdTY)
- [04 - Fibonacci Numbers - Dynamic Programming Bottom Up](https://youtu.be/nw8tJ5eP5aI)

#### Leetcode

[Introduction to DP - Fibonacci Numbers](https://leetcode.com/problems/fibonacci-number/)

## Most Popular Problems

### 1. Longest Common Subsequence

Given two sequences, find the length of the longest subsequence present in both of them. A subsequence is a sequence
that appears in the same relative order, but not necessarily contiguous.

For example, “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”.

#### Youtube

- [05 - Longest Common Subsequence - Definition](https://youtu.be/0z_uic-lge8)
- [06 - Longest Common Subsequence - Recursive approach](https://youtu.be/218NLh8rG5g)
- [07 - Longest Common Subsequence - Dynamic Programming approach](https://youtu.be/ZvLvrgwPs1s)
- [08 - Longest Common Subsequence - Final DP solution in Java](https://youtu.be/uH5x9cXl218)

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

### 12. Longest Palindromic Substring

Given a string s, return the longest palindromic substring in s.

A string is called a palindrome string if the reverse of that string is the same as the original string.

Example:

Input: s = "babad"

Output: "bab"

Explanation: "aba" is also a valid answer.

#### Youtube

- [50 - Longest Palindromic Substring - Definition](https://www.youtube.com/watch?v=c2rFA-u-EHo)
- [51 - Longest Palindromic Substring - Basic approach](https://www.youtube.com/watch?v=1PPh3Lg_3Lc)
- [52 - Longest Palindromic Substring - Dynamic Programming approach 1](https://www.youtube.com/watch?v=6giVKVwhj3M)
- [53 - Longest Palindromic Substring - Dynamic Programming approach 2](https://www.youtube.com/watch?v=IMo2YdNpBGk)
- [54 - Longest Palindromic Substring - Final DP solution in Java](https://www.youtube.com/watch?v=MIVVbYP1-qs)
- [55 - Longest Palindromic Substring - submission in leetcode](https://www.youtube.com/watch?v=pUofBwSe35g)

#### Leetcode

[5. Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)

### 13. Partition Equal Subset Sum

Given a non-empty array nums containing only positive integers, find if the array can be partitioned into two subsets
such that the sum of elements in both subsets is equal.

Example:

Input: nums = [1,5,11,5]

Output: true

Explanation: The array can be partitioned as [1, 5, 5] and [11].

#### Youtube

- [56 - Partition Equal Subset Sum - Definition](https://www.youtube.com/watch?v=M0iqJa9T4GM)
- [57 - Partition Equal Subset Sum - Dynamic Programming approach 1](https://www.youtube.com/watch?v=_LUuZqRoabc)
- [58 - Partition Equal Subset Sum - Dynamic Programming approach 2](https://www.youtube.com/watch?v=vSvkbVy-Ls8)
- [59 - Partition Equal Subset Sum - Final DP solution in Java](https://www.youtube.com/watch?v=DBYYKY5emkQ)

#### Leetcode

[416. Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/)

### 14. Counting Bits

Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's
in the binary representation of i.

Example:

Input: n = 2

Output: [0,1,1]

Explanation:

0 --> 0

1 --> 1

2 --> 10

#### Youtube

- [60 - Counting Bits - Definition](https://www.youtube.com/watch?v=tEBzFyZ3nNE)
- [61 - Counting Bits - Dynamic Programming approach 1](https://www.youtube.com/watch?v=Fh6KdpFuaVg)
- [62 - Counting Bits - Dynamic Programming approach 2](https://www.youtube.com/watch?v=kophZUh023I)
- [63 - Counting Bits - Final DP solution in Java](https://www.youtube.com/watch?v=Zc8L-tFTGrs)

#### Leetcode

[338. Counting Bits](https://leetcode.com/problems/counting-bits/)

### 15. Matrix Chain Multiplication

Given the dimension of a sequence of matrices in an array arr[], where the dimension of the ith matrix is (arr[i-1] *
arr[i]), the task is to find the most efficient way to multiply these matrices together such that the total number of
element multiplications is minimum.

Example:

Input: arr[] = {40, 20, 30, 10, 30}

Output: 26000

Explanation:There are 4 matrices of dimensions 40×20, 20×30, 30×10, 10×30. Let the input 4 matrices be A, B, C and D.
The minimum number of multiplications are obtained by putting parenthesis in following way (A(BC))D.

The minimum is 20 x 30 x 10 + 40 x 20 x 10 + 40 x 10 x 30

#### Youtube

- [64 - Matrix Chain Multiplication - Definition 1](https://www.youtube.com/watch?v=vLWuOoWNhTM)
- [65 - Matrix Chain Multiplication - Definition 2](https://www.youtube.com/watch?v=TWftlqo-sq8)
- [66 - Matrix Chain Multiplication - Dynamic Programming approach 1](https://www.youtube.com/watch?v=EJ9YX-DqPJ8)
- [67 - Matrix Chain Multiplication - Dynamic Programming approach 2](https://www.youtube.com/watch?v=PTCW6MA3f3w)
- [68 - Matrix Chain Multiplication - Dynamic Programming approach 3](https://www.youtube.com/watch?v=HIeXk1h1k88)
- [69 - Matrix Chain Multiplication - Dynamic Programming approach 4](https://www.youtube.com/watch?v=fy7zpcWhS7E)
- [70 - Matrix Chain Multiplication - Final DP solution in Java](https://www.youtube.com/watch?v=A-QQqE7trEQ)

#### Coding Ninjas

[Matrix Chain Multiplication](https://www.codingninjas.com/codestudio/problems/matrix-chain-multiplication_975344)

### 16. Paint House

There are a row of n houses, each house can be painted with one of the three colors: red, blue or green.

The cost of painting each house with a certain color is different. You have to paint all the houses such that no two
adjacent houses have the same color, and you need to cost the least. Return the minimum cost.

The cost of painting each house with a certain color is represented by a n x 3 cost matrix.

For example, costs[0][0] is the cost of painting house 0 with color red; costs[1][2] is the cost of painting house 1
with color green, and so on...

Find the minimum cost to paint all houses.

Example:

Input: [[14,2,11],[11,14,5],[14,3,10]]

Output: 10

Explanation:

Paint house 0 into blue, paint house 1 into green, paint house 2 into blue.

Minimum cost: 2 + 5 + 3 = 10.

#### Youtube

- [71 - Paint House - Definition](https://www.youtube.com/watch?v=78UlFsOmIz0)
- [72 - Paint House - Dynamic Programming approach](https://www.youtube.com/watch?v=di5tYZnmiaQ)
- [73 - Paint House - Final DP solution in Java](https://www.youtube.com/watch?v=aai_kEAdrJM)

#### LintCode

[515 · Paint House](https://www.lintcode.com/problem/515/)

### 17. Pascal's Triangle

Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it.

Example:

Input: numRows = 5

Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

#### Youtube

- [74 - Pascals Triangle - Definition](https://www.youtube.com/watch?v=EcFaoxuFlQE)
- [75 - Pascals Triangle - Dynamic Programming approach](https://www.youtube.com/watch?v=NWJpEr3T7pI)
- [76 - Pascals Triangle - Final DP solution in Java](https://www.youtube.com/watch?v=8z1uAYGlItY)

#### Leetcode

[118. Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/)

### 18. Decode Ways

A message containing letters from A-Z can be encoded into numbers using the following mapping:

'A' -> "1"

'B' -> "2"

...

'Z' -> "26"

To decode an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the
mapping above (there may be multiple ways).

For example, "11106" can be mapped into:

"AAJF" with the grouping (1 1 10 6)

"KJF" with the grouping (11 10 6)

Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different from "06".

Given a string s containing only digits, return the number of ways to decode it.

The test cases are generated so that the answer fits in a 32-bit integer.

Example :

Input: s = "12"

Output: 2

Explanation: "12" could be decoded as "AB" (1 2) or "L" (12).

#### Youtube

- [77 - Decode Ways - Definition](https://www.youtube.com/watch?v=8zg3FNR886Y)
- [78 - Decode Ways - Dynamic Programming approach 1](https://www.youtube.com/watch?v=pXVHRtkBUXo)
- [79 - Decode Ways - Dynamic Programming approach 2](https://www.youtube.com/watch?v=EXNXx9Jh_O8)
- [80 - Decode Ways - Final DP solution in Java](https://www.youtube.com/watch?v=5FzwVxoY51k)

#### Leetcode

[91. Decode Ways](https://leetcode.com/problems/decode-ways/)

### 19. Unique Paths

There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]). The robot
tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any
point in time.

Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the
bottom-right corner.

The test cases are generated so that the answer will be less than or equal to 2 * 109.

Example:

Input: m = 3, n = 2

Output: 3

Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:

Right -> Down -> Down

Down -> Down -> Right

Down -> Right -> Down

#### Youtube

- [81 - Unique Paths - Definition](https://www.youtube.com/watch?v=812tLxs3D7Y)
- [82 - Unique Paths - Dynamic Programming approach](https://www.youtube.com/watch?v=fiIvyIdsoNQ)
- [83 - Unique Paths - Final DP solution in Java](https://www.youtube.com/watch?v=yEuJDqmKzs8)

#### Leetcode

[62. Unique Paths](https://leetcode.com/problems/unique-paths/)

### 20. Minimum Path Sum

Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum
of all numbers along its path.

Note: You can only move either down or right at any point in time.

Example:

Input: grid = [[1,3,1],[1,5,1],[4,2,1]]

Output: 7

Explanation: Because the path 1 → 3 → 1 → 1 → 1 minimizes the sum.

#### Youtube

- [84 - Minimum Path Sum - Definition](https://www.youtube.com/watch?v=wVvKY3aWpgQ)
- [85 - Minimum Path Sum - Dynamic Programming approach 1](https://www.youtube.com/watch?v=6_cplJkibCc)
- [86 - Minimum Path Sum - Dynamic Programming approach 2](https://www.youtube.com/watch?v=MmyGuKLG-f0)
- [87 - Minimum Path Sum - Final DP solution in Java](https://www.youtube.com/watch?v=_KJ82HfvEsw)

#### Leetcode

[64. Minimum Path Sum](https://leetcode.com/problems/minimum-path-sum/)

### 21. Count Vowels Permutation

Given an integer n, your task is to count how many strings of length n can be formed under the following rules:

Each character is a lower case vowel ('a', 'e', 'i', 'o', 'u')

Each vowel 'a' may only be followed by an 'e'.

Each vowel 'e' may only be followed by an 'a' or an 'i'.

Each vowel 'i' may not be followed by another 'i'.

Each vowel 'o' may only be followed by an 'i' or a 'u'.

Each vowel 'u' may only be followed by an 'a'.

Example:

Input: n = 2

Output: 10

Explanation: All possible strings are: "ae", "ea", "ei", "ia", "ie", "io", "iu", "oi", "ou" and "ua".

#### Youtube

- [88 - Count Vowels Permutation - Definition](https://www.youtube.com/watch?v=-5n2yUiEEOI)
- [89 - Count Vowels Permutation - Dynamic Programming approach 1](https://www.youtube.com/watch?v=xfw9SS41rsU)
- [90 - Count Vowels Permutation - Dynamic Programming approach 2](https://www.youtube.com/watch?v=QoQPuc-rhoU)
- [91 - Count Vowels Permutation - Final DP solution in Java](https://www.youtube.com/watch?v=P8gKhxD8ZZQ)

#### Leetcode

[1220. Count Vowels Permutation](https://leetcode.com/problems/count-vowels-permutation/)

### 22. Target Sum

You are given an integer array nums and an integer target.

You want to build an expression out of nums by adding one of the symbols '+' and '-' before each integer in nums and
then concatenate all the integers.

For example, if nums = [2, 1], you can add a '+' before 2 and a '-' before 1 and concatenate them to build the
expression "+2-1". Return the number of different expressions that you can build, which evaluates to target.

Example:

Input: nums = [1,1,1,1,1], target = 3

Output: 5

Explanation: There are 5 ways to assign symbols to make the sum of nums be target 3.

-1 + 1 + 1 + 1 + 1 = 3

+1 - 1 + 1 + 1 + 1 = 3

+1 + 1 - 1 + 1 + 1 = 3

+1 + 1 + 1 - 1 + 1 = 3

+1 + 1 + 1 + 1 - 1 = 3

#### Youtube

- [92 - Target Sum - Definition](https://www.youtube.com/watch?v=oqBYqmJH2dk)
- [93 - Target Sum - Dynamic Programming approach 1](https://www.youtube.com/watch?v=IvSVRNC1bUM)
- [94 - Target Sum - Dynamic Programming approach 2](https://www.youtube.com/watch?v=MfenII6ys6c)
- [95 - Target Sum - Final DP solution in Java](https://www.youtube.com/watch?v=3CAFxRPfJ_c)

#### Leetcode

[494. Target Sum](https://leetcode.com/problems/target-sum/)

### 23. Jump Game

You are given an integer array nums. You are initially positioned at the array's first index,

and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.

Example:

Input: nums = [2,3,1,1,4]

Output: true

Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

#### Youtube

- [96 - Jump Game - Definition](https://www.youtube.com/watch?v=x55Y-HBpwqA)
- [97 - Jump Game - Dynamic Programming approach 1](https://www.youtube.com/watch?v=gsUjy-uRFqU)
- [98 - Jump Game - Dynamic Programming approach 2](https://www.youtube.com/watch?v=UtHWdKjvpcU)
- [99 - Jump Game - Final DP solution in Java](https://www.youtube.com/watch?v=ezAZFiGpMuE)

#### Leetcode

[55. Jump Game](https://leetcode.com/problems/jump-game/)

### 24. Jump Game II

You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].

Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i]
, you can jump to any nums[i + j] where:

0 <= j <= nums[i] and

i + j < n

Return the minimum number of jumps to reach nums[n - 1].

The test cases are generated such that you can reach nums[n - 1].

Example:

Input: nums = [2,3,1,1,4]

Output: 2

Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to
the last index.

#### Youtube

- [100 - Jump Game II - Definition](https://www.youtube.com/watch?v=hNCldFgPQZI)
- [101 - Jump Game II - Dynamic Programming approach 1](https://www.youtube.com/watch?v=tqgohXGKtaw)
- [102 - Jump Game II - Dynamic Programming approach 2](https://www.youtube.com/watch?v=hbx69_QR860)
- [103 - Jump Game II - Final DP solution in Java](https://www.youtube.com/watch?v=TJu3FrsRU6M)

#### Leetcode

[45. Jump Game II](https://leetcode.com/problems/jump-game-ii/)

### 25. House Robber II

You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed.

All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one.

Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two
adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can
rob tonight without alerting the police.

Example:

Input: nums = [2,3,2]

Output: 3

Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.

#### Youtube

- [104 - House Robber II - Definition](https://www.youtube.com/watch?v=HGm0s5wm3OU)
- [105 - House Robber II - Dynamic Programming approach 1](https://www.youtube.com/watch?v=8bTKewlp8P0)
- [106 - House Robber II - Dynamic Programming approach 2](https://www.youtube.com/watch?v=FmDZfyjvIXo)
- [107 - House Robber II - Final DP solution in Java](https://www.youtube.com/watch?v=GUt_SUSAz0E)

#### Leetcode

[213. House Robber II](https://leetcode.com/problems/house-robber-ii/)

### Next Steps

[Next Steps](https://www.youtube.com/watch?v=GLG-0SnL5rA)


