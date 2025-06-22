package com.cairone.leet.linkedlist.exercise32;

public class DoublyLinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
    }

    public Node getHead() {
        return head;
    }

    public void printList() {
        StringBuilder output = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            output.append(temp.value);
            if (temp.next != null) {
                output.append(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(output.toString());
    }

    public void makeEmpty() {
        head = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void reverseBetween(int startIndex, int endIndex) {
        if (head == null || startIndex == endIndex) {
            return;
        }

        // Create a dummy node
        Node dummy = new Node(0);
        dummy.next = head;
        head.prev = dummy;

        // Find the node before start position
        Node beforeStart = dummy;
        for (int i = 0; i < startIndex; i++) {
            beforeStart = beforeStart.next;
        }

        // Current will iterate through the sublist
        Node current = beforeStart.next;
        // For each iteration, move the next node to the start of the sublist
        for (int i = 0; i < endIndex - startIndex; i++) {
            Node nodeToMove = current.next;

            // Skip the node we're moving
            current.next = nodeToMove.next;
            if (nodeToMove.next != null) {
                nodeToMove.next.prev = current;
            }

            // Move the node to the start of the sublist
            nodeToMove.next = beforeStart.next;
            nodeToMove.prev = beforeStart;
            beforeStart.next.prev = nodeToMove;
            beforeStart.next = nodeToMove;
        }

        // Update head if necessary
        if (startIndex == 0) {
            head = dummy.next;
        }
        head.prev = null;
    }

}
