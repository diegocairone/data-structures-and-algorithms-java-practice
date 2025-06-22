package com.cairone.leet.linkedlist.exercise19;

public class LinkedList {

    private Node head;
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
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        StringBuilder output = new StringBuilder();
        while (current != null) {
            output.append(current.value).append(" -> ");
            current = current.next;
        }
        // Remove the last " -> " and print the result
        if (output.length() > 0) {
            output.setLength(output.length() - 4);
            System.out.println(output.toString());
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void swapPairs() {
        // Handle empty list or single node
        if (head == null || head.next == null) return;

        // Create a dummy node to handle the first pair easily
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        // Traverse the list, swapping pairs
        while (prev.next != null && prev.next.next != null) {
            // Set up pointers for the pair to swap
            Node first = prev.next;
            Node second = first.next;

            // Perform the swap
            first.next = second.next;
            second.next = first;
            prev.next = second;

            // Move prev pointer forward for next pair
            prev = first;
        }

        // Update head to the new first node
        head = dummy.next;
    }

}
