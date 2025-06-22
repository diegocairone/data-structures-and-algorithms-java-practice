Array: Rotate ( ** Interview Question)
You are tasked with implementing a method, rotate, that rotates an array to the right by k steps, where k is a non-negative integer.



Method Signature

public static void rotate(int[] nums, int k)


This method takes as input an array of integers nums and a non-negative integer k, and rotates the array in-place.



Input

An array of integers nums (you can assume the array is not empty)

A non-negative integer k, which represents the number of steps the array should be rotated.



Output
This function does not return anything. It modifies the input array nums in-place to rotate it to the right by k steps.



Example

For example, if the input array is {1, 2, 3, 4, 5, 6, 7} and k = 3, the method should rotate the array to become {5, 6, 7, 1, 2, 3, 4}.



Note

Rotation is performed in steps. For each step, the last element of the array is moved to the front, and all other elements are moved one step to the right.

The number of rotations is equal to k mod n, where n is the length of the array. This is because after n rotations, the array would return to its original state.

The rotation should be performed in-place, i.e., without making a copy of the original array (except for temporary variables).

Your solution should run efficiently, ideally with a linear time complexity and constant space complexity.
