package com.cairone.leet.linkedlist.exercise31;

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

    public void partitionList(int x) {
        if (head == null || head.next == null) return;

        // Create dummy nodes for two sublists
        Node lessDummy = new Node(0);
        Node greaterDummy = new Node(0);
        Node less = lessDummy;
        Node greater = greaterDummy;

        // Traverse original list
        Node current = head;
        while (current != null) {
            if (current.value < x) {
                less.next = current;
                current.prev = less;
                less = current;
            } else {
                greater.next = current;
                current.prev = greater;
                greater = current;
            }
            current = current.next;
        }

        // Join the two sublists
        less.next = greaterDummy.next;
        if (greaterDummy.next != null) {
            greaterDummy.next.prev = less;
        }
        greater.next = null;

        // Update head and reset head.prev
        head = lessDummy.next;
        if (head != null) {
            head.prev = null;
        }
    }

}
