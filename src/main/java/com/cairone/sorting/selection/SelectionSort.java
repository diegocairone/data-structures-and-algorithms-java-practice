package com.cairone.sorting.selection;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {4, 2, 6, 5, 1, 3};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap the found minimum element
            if (i != minIdx) {
                int temp = array[i];
                array[i] = array[minIdx];
                array[minIdx] = temp;
            }
        }
    }
}
