package com.cairone.sorting.merge;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] originalArray = {3, 1, 4, 2};
        int[] sortedArray = mergeSort(originalArray);

        System.out.println("Original array: " + Arrays.toString(originalArray));
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));
    }

    public static int[] mergeSort(int[] array) {
        if (array.length == 1) {
            return array; // Base case: an array of length 0 or 1 is already sorted
        }
        int midIndex = array.length / 2;
        int[] left = mergeSort( Arrays.copyOfRange(array, 0, midIndex) );
        int[] right = mergeSort( Arrays.copyOfRange(array, midIndex, array.length) );

        return merge(left, right);
    }

    // Helper method to merge two sorted arrays into one sorted array
    public static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];
        // Index of the combined array
        int index = 0;
        int i = 0, j = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combined[index] = array1[i];
                index++;
                i++;
            } else {
                combined[index] = array2[j];
                index++;
                j++;
            }
        }
        while (i < array1.length) {
            combined[index] = array1[i];
            index++;
            i++;
        }
        while (j < array2.length) {
            combined[index] = array2[j];
            index++;
            j++;
        }
        return combined;
    }
}
