package com.cairone.sorting.bubble;

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

    public void bubbleSort() {
        if (length < 2) return; // If the list has less than 2 elements, it's already sorted.

        Node sortedUntil = null; // Marks the end of the sorted portion of the list.

        while (sortedUntil != head.next) {
            Node current = head;
            while (current.next != sortedUntil) {
                if (current.value > current.next.value) {
                    // Swap the values of the current node and the next node.
                    int temp = current.value;
                    current.value = current.next.value;
                    current.next.value = temp;
                }
                current = current.next; // Move to the next node.
            }
            sortedUntil = current; // Update the sortedUntil marker.
        }
    }
}
