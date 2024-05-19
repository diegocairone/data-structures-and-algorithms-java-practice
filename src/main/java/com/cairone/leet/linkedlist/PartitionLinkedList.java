package com.cairone.leet.linkedlist;

public class PartitionLinkedList {

    private Node head;
    private int length;

    public class Node {
        public int value;
        public Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public PartitionLinkedList(int value) {
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
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        length = 0;
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
        }
        length++;
    }

    public void partitionList(int x) {

        Node dummy1 = new Node(0); // Dummy node for chain of nodes with values < x
        Node dummy2 = new Node(0); // Dummy node for chain of nodes with values >= x
        Node node1 = dummy1, node2 = dummy2; // Pointers to the current end of each chain

        Node current = head;
        while (current != null) {
            if (current.value < x) {
                node1.next = current;
                node1 = node1.next;
            } else {
                node2.next = current;
                node2 = node2.next;
            }
            current = current.next;
        }

        // Combine the two chains
        node1.next = dummy2.next;
        // Mark the end of the combined chain
        node2.next = null;

        // Update the head of the list
        head = dummy1.next;
    }
}
