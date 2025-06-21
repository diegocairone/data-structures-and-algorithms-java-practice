package com.cairone.sorting.insertion;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 3, 5, 6};
        insertionSort(array);

        System.out.println("Sorted array:" + Arrays.toString(array));
    }

    public static void insertionSort(int[] array) {

        // starting from the second element, iterate through the array
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            // move elements of array[0..i-1], that are greater than temp
            // to one position ahead of their current position
            // eval j > -1 first to avoid ArrayIndexOutOfBoundsException (array[-1])
            while (j > -1 && temp < array[j]) {
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }
}
