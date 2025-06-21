package com.cairone.sorting.merge;

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

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
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

    public void merge(LinkedList other) {
        Node dummy = new Node(0); // Dummy node to simplify merging
        Node current = dummy;

        Node thisCurrent = this.head;
        Node otherCurrent = other.head;

        // Merge the two lists
        while (thisCurrent != null && otherCurrent != null) {
            if (thisCurrent.value < otherCurrent.value) {
                current.next = thisCurrent;
                thisCurrent = thisCurrent.next;
            } else {
                current.next = otherCurrent;
                otherCurrent = otherCurrent.next;
            }
            current = current.next;
        }

        // Append remaining nodes from either list
        if (thisCurrent != null) {
            current.next = thisCurrent;
        } else if (otherCurrent != null) {
            current.next = otherCurrent;
        }

        // Update head, tail, and length of the current list
        this.head = dummy.next;

        Node temp = this.head;
        this.length = 0;
        while (temp != null) {
            this.tail = temp;
            temp = temp.next;
            this.length++;
        }
    }
}



