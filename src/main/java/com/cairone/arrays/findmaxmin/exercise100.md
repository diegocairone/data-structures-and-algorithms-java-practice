Array: Find Max Min ( ** Interview Question)
In this problem, you are given an array of integers, and the task is to write a method that finds the maximum and minimum numbers in the array.

The method should return these two numbers as an array with the maximum number at the first index and the minimum number at the second index.



Method Signature

public static int[] findMaxMin(int[] myList)


This method accepts an integer array myList as the input and returns an integer array of size two.



Example

Let's illustrate the problem using an example:

Input: myList = [5, 3, 8, 1, 6, 9]

Output: [9, 1]



The function should iterate through the array to find the maximum and minimum numbers. In this case, the maximum number is 9, and the minimum number is 1. Hence, the method should return [9, 1].



Additional Notes

The main method provides some test cases to check the solution's correctness. It is important to note that the method should work correctly with negative numbers and zeros. Also, if the array contains duplicate numbers, the function should still be able to correctly identify the maximum and minimum numbers.
