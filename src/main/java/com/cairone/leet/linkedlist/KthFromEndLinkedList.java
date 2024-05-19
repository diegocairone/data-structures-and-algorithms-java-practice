package com.cairone.leet.linkedlist;

public class KthFromEndLinkedList {

    private Node head;
    private Node tail;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public KthFromEndLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node findKthFromEnd(int k) {

        Node first = head;
        Node second = head;

        // Move the first pointer k nodes ahead
        for (int i = 0; i < k; i++) {
            if (first == null) {
                // If the list has fewer than k nodes
                return null;
            }
            first = first.next;
        }

        // Move both pointers one step at a time
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        // The second pointer is now pointing at the k-th node from the end
        return second;
    }
}
