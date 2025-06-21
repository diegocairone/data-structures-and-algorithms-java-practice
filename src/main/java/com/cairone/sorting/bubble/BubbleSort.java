package com.cairone.sorting.bubble;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {4, 2, 6, 5, 1, 3};
        bubbleSort(array);

        System.out.println("Sorted array:" + Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {

        for (int i = array.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                int currentItem = array[j];
                int nextItem = array[j + 1];
                if (currentItem > nextItem) {
                    // Swap the items
                    array[j] = nextItem;
                    array[j + 1] = currentItem;
                }
            }
        }
    }
}
