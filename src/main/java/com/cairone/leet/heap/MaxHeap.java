package com.cairone.leet.heap;

import java.util.ArrayList;
import java.util.List;

public class MaxHeap {

    public static void main1(String[] args) {
        MaxHeap myMaxHeap = new MaxHeap();

        myMaxHeap.insert(99);
        myMaxHeap.insert(72);
        myMaxHeap.insert(61);
        myMaxHeap.insert(58);
        System.out.println(myMaxHeap.getHeap());

        myMaxHeap.insert(100);
        System.out.println(myMaxHeap.getHeap());

        myMaxHeap.insert(75);
        System.out.println(myMaxHeap.getHeap());

        /*
        expected output
        [99, 72, 61, 58]
        [100, 99, 61, 58, 72]
        [100, 99, 75, 58, 72, 61]
         */
    }

    public static void main(String[] args) {
        MaxHeap myMaxHeap = new MaxHeap();

        myMaxHeap.insert(95);
        myMaxHeap.insert(75);
        myMaxHeap.insert(80);
        myMaxHeap.insert(55);
        myMaxHeap.insert(60);
        myMaxHeap.insert(50);
        myMaxHeap.insert(65);
        System.out.println(myMaxHeap.getHeap());

        myMaxHeap.remove();
        System.out.println(myMaxHeap.getHeap());

        myMaxHeap.remove();
        System.out.println(myMaxHeap.getHeap());

        /*
        expected output
        [95, 75, 80, 55, 60, 50, 65]
        [80, 75, 65, 55, 60, 50]
        [75, 60, 65, 55, 50]
         */
    }

    // heap starting at index zero; 0-index heap
    private List<Integer> heap;

    public MaxHeap() {
        this.heap = new ArrayList<>();
    }

    public List<Integer> getHeap() {
        // return a new copy of heap
        return new ArrayList<>(heap);
    }

    private int leftChild(int index) {
        return index * 2 + 1;
    }

    private int rightChild(int index) {
        return index * 2 + 2;
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private void swap(int index1, int index2) {
        int temp = heap.get(index1);
        heap.set(index1, heap.get(index2));
        heap.set(index2, temp);
    }

    public void insert(int value) {
        heap.add(value);
        int current = heap.size() - 1;
        while (current > 0 && heap.get(current) > heap.get(parent(current))) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public Integer remove() {
        if (heap.size() == 0) {
            return null;
        } else if (heap.size() == 1) {
            return heap.remove(0);
        }
        int maxValue = heap.get(0);
        heap.set(0, heap.remove(heap.size() - 1));
        sinkDown(0);
        return maxValue;
    }

    private void sinkDown(int index) {
        int maxIndex = index;
        while(true) {
            int leftIndex = leftChild(index);
            int rightIndex = rightChild(index);
            if (leftIndex < heap.size() && heap.get(leftIndex) > heap.get(maxIndex)) {
                maxIndex = leftIndex;
            }
            if (rightIndex < heap.size() && heap.get(rightIndex) > heap.get(maxIndex)) {
                maxIndex = rightIndex;
            }
            if (maxIndex == index) {
                return;
            } else {
                swap(index, maxIndex);
                index = maxIndex;
            }
        }
    }
}
