package com.cairone.leet.heap;

public class KthSmallestElement {

    /**
     * This method takes two parameters as input: an array of integers nums and an integer k.
     * The array nums can have both positive and negative integers and can be of any size.
     * The integer k is guaranteed to be in the range of 1 to the length of the array inclusive.
     *
     * Your task is to find the kth smallest element in the array nums.
     * In other words, if the elements of the array were sorted in ascending order,
     * the element at the kth position (1-indexed) is the output.
     *
     * Constraints:
     * You must use a MaxHeap to solve this problem. A Heap class is already provided for you, and you can use its methods to add elements to the heap (insert), remove the maximum element (remove), and get the current size of the heap (getHeap().size()).
     * Your solution should aim for a time complexity better than O(n log n), which would be the case if you sorted the array.
     *
     * @param nums The first parameter is an array of integers, nums. The array may contain duplicate elements.
     * @param k The second parameter is an integer, k (1 ≤ k ≤ nums.length). This is the position of the element to return if the array was sorted in ascending order.
     * @return
     */
    public static int findKthSmallest(int[] nums, int k) {
        MaxHeap heap = new MaxHeap();
        for (int num : nums) {
            heap.insert(num);
        }
        int size = nums.length - k;
        for (int i = 0; i < size; i++) {
            heap.remove();
        }
        return heap.remove();
    }
}
