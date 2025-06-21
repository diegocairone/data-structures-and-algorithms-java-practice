package com.cairone.sorting.insertion;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void insertionSort() {
        if (head == null || head.next == null) {
            return; // List is already sorted if it has less than 2 nodes
        }

        Node sortedListHead = null; // Start with an empty sorted list
        Node current = head; // Pointer to traverse the unsorted list

        while (current != null) {
            Node nextNode = current.next; // Store the next node
            if (sortedListHead == null || current.value < sortedListHead.value) {
                // Insert at the beginning of the sorted list
                current.next = sortedListHead;
                sortedListHead = current;
            } else {
                // Find the correct position in the sorted list
                Node searchPointer = sortedListHead;
                while (searchPointer.next != null && searchPointer.next.value < current.value) {
                    searchPointer = searchPointer.next;
                }
                // Insert the current node in the sorted list
                current.next = searchPointer.next;
                searchPointer.next = current;
            }
            current = nextNode; // Move to the next node in the unsorted list
        }

        // Update head and tail pointers
        head = sortedListHead;
        tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
    }

}
