Array: Remove Element ( ** Interview Question)
In this problem, we are given an array of integers nums and a value val. The goal is to remove all occurrences of val in-place from the array and return the new length of the array after removal.

The method removeElement(int[] nums, int val) takes an array of integers nums and an integer val as input. It modifies the nums array in-place to remove all instances of val and returns the new length of nums after the removal.

It's important to note that the order of elements can be changed. We don't need to consider elements beyond the new length.

For example, given nums = [3,2,2,3] and val = 3, the method should return 2, and the first two elements of nums should be 2.



Method Signature:

public static int removeElement(int[] nums, int val)


Constraints

The array nums can contain negative and positive numbers, and 0.



Example

Let's illustrate the problem using an example:

Input:

nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

val = 1

Output: The new length of the array should be 7, and the array itself should look like this after modification: [-2, -3, 4, -1, 2, -5, 4, -5, 4]



We iterate over the nums array and, whenever we encounter a number that is not equal to val, we shift it to the front of the array. By doing this, we can effectively remove all occurrences of val from the array and get the new length.
