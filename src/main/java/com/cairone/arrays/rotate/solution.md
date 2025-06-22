public static void rotate(int[] nums, int k) {
k = k % nums.length;

        // Reverse the first part
        for (int start = 0, end = nums.length - k - 1; start < end; start++, end--) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
 
        // Reverse the second part
        for (int start = nums.length - k, end = nums.length - 1; start < end; start++, end--) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
 
        // Reverse the whole array
        for (int start = 0, end = nums.length - 1; start < end; start++, end--) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }
    }



The rotate method rotates the elements of an array to the right by k steps. The number of steps, k, is first reduced by taking the modulus with the array's length. This is because if k is larger than the array's length, we only need to consider k modulo the length of the array as the rest of the rotations will just cycle the array back to its original configuration.

The method uses a clever trick to perform the rotation in-place (i.e., without needing extra space).

Here's how it works:

The method first reverses the first part of the array, from the first element to the (length - k - 1)th element. It does this by swapping the first and last elements of this section, then the second and second-to-last elements, and so on until it meets in the middle.

The method then reverses the second part of the array, from the (length - k)th element to the last element. It does this in the same way as the first part.

Now the array is in a state where the first part and the second part are each reversed, but the entire array is not yet in the correct order. So the method reverses the entire array. After this step, the elements are now in their correctly rotated positions.



The reason this works is because reversing sections of the array and then the entire array has the effect of rotating the elements. This method is more efficient than a naive approach that would shift the elements one-by-one, which would take more time for large k.

This algorithm has a time complexity of O(n), as every element in the array is visited once, and the space complexity is O(1) because no additional space is required.





Code with inline comments:



public static void rotate(int[] nums, int k) {
// Reduce k to its equivalent value within array length range.
k = k % nums.length;

    // Reverse the first part of the array (from start to length-k)
    for (int start = 0, end = nums.length - k - 1; start < end; start++, end--) {
        // Swap elements at positions 'start' and 'end'
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
 
    // Reverse the second part of the array (from length-k to end)
    for (int start = nums.length - k, end = nums.length - 1; start < end; start++, end--) {
        // Swap elements at positions 'start' and 'end'
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
 
    // Reverse the whole array
    for (int start = 0, end = nums.length - 1; start < end; start++, end--) {
        // Swap elements at positions 'start' and 'end'
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
