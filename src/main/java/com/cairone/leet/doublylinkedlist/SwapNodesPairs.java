package com.cairone.leet.doublylinkedlist;

import java.util.StringJoiner;

/**
 * DLL: Swap Nodes in Pairs
 *
 * You are given a doubly linked list.
 *
 * Implement a method called swapPairs within the class that swaps the values of adjacent nodes
 * in the linked list. The method should not take any input parameters.
 *
 * Note: This DoublyLinkedList does not have a tail pointer which will make the implementation easier.
 *
 * Example:  1 <-> 2 <-> 3 <-> 4
 * should become 2 <-> 1 <-> 4 <-> 3
 *
 * Your implementation should handle edge cases such as an empty linked list or a linked list with only one node.
 *
 * Note: You must solve the problem WITHOUT MODIFYING THE VALUES in the list's nodes (i.e., only the nodes'
 * prev and next pointers may be changed.)
 */
public class SwapNodesPairs {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return new StringJoiner(", ", Node.class.getSimpleName() + "[", "]")
                    .add("value=" + value)
                    .toString();
        }
    }

    public SwapNodesPairs(int value) {
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
            newNode.prev = current;
        }
        length++;
    }

    public void swapPairs() {

        Node current = head;

        while (current != null && current.next != null) {

            Node before = current.prev;
            Node after = current.next;
            Node nextIter = after.next;

            if (current.equals(head)) {
                head = after;
            }

            current.next = nextIter;
            current.prev = after;

            after.next = current;
            after.prev = before;

            if (before != null) {
                before.next = after;
            }

            if (nextIter != null) {
                nextIter.prev = current;
            }

            current = nextIter;
        }
    }

    public static void main(String[] args) {
        SwapNodesPairs list = new SwapNodesPairs(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.swapPairs();
        list.printList();
    }
}
