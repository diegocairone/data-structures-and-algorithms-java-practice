Array: Remove Duplicates ( ** Interview Question)
The task is to write a method named removeDuplicates, that removes all duplicate occurrences of integers from a sorted array in-place such that each unique element appears only once.

The relative order of the elements should be kept the same.

The method also needs to return the new length of the array after duplicates have been removed. It's important to note that the array is passed by reference to the function, which means modification to the array will be known to the caller as well.



Method Signature

public static int removeDuplicates(int[] nums)


This method takes as input an array of integers nums and returns an integer.



Input

An array of integers nums that are sorted in ascending order.



Output

Modifies the input array nums in-place to remove duplicate elements.

Returns an integer that is the new length of the array after duplicates have been removed.



Example

For example, if the input array is {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, the method should modify the array to {0, 1, 2, 3, 4} and return 5.



Additional Notes

The method removeDuplicates should do this by moving the 'unique' elements to the start of the array, and then returning the length of the 'unique' portion of the array.

The method should not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory (this means you cannot use another data structure like a set).

When the array is empty, the method should return 0.



Please ensure your solution handles these cases correctly.
