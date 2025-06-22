Array: Max Sub Array ( ** Interview Question)
You have been asked to create a method in Java, maxSubarray, that finds the contiguous subarray (containing at least one number) which has the largest sum and returns its sum.



Method Signature

public static int maxSubarray(int[] nums)


This method takes as input an array of integers nums and returns an integer representing the maximum sum of a contiguous subarray within the input array.



Input

An array of integers nums



Output

An integer that represents the maximum sum of a contiguous subarray within the input array.



Example

For example, if the input array is {-2, 1, -3, 4, -1, 2, 1, -5, 4}, the method should return 6 as the subarray with the maximum sum is {4, -1, 2, 1} which sums to 6.



Note

A subarray is a contiguous part of an array. In other words, a subarray is a sequence of elements that are in direct succession in the array, with no elements from the array skipped or interspersed.

You need to find a contiguous subarray with the largest sum. This subarray could be the entire array, or it could be a smaller part of the array. It could include negative numbers, but the sum of the subarray must be maximized.

You can assume that the input array is non-empty and contains at least one number.


