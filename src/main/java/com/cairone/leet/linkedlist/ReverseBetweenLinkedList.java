package com.cairone.leet.linkedlist;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

@Slf4j
public class ReverseBetweenLinkedList {

    private Node head;
    private int length;

    class Node {
        int value;
        Node next;

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

    public ReverseBetweenLinkedList(int value) {
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

    public List<Integer> asList() {
        List<Integer> nodes = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            nodes.add(temp.value);
            temp = temp.next;
        }
        return nodes;
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

    public void reverseBetweenSolved(int startIndex, int endIndex) {
        if (head == null) return;

        Node dummyNode = new Node(0);
        dummyNode.next = head;
        Node previousNode = dummyNode;

        for (int i = 0; i < startIndex; i++) {
            previousNode = previousNode.next;
        }

        Node currentNode = previousNode.next;

        for (int i = 0; i < endIndex - startIndex; i++) {
            Node nodeToMove = currentNode.next;
            currentNode.next = nodeToMove.next;
            nodeToMove.next = previousNode.next;
            previousNode.next = nodeToMove;
        }

        head = dummyNode.next;
    }

    public void reverseBetween(int m, int n) {

        Node before = null;
        Node current = head;
        int i = 0;

        // aux vars
        Node prevHeadNode = null;
        Node prevTailNode = null;
        Node subHead = null;
        Node subTail = null;

        while (current != null) {

            // Where to move next?
            Node after = current.next;

            if (i == m) {   // i = 3
                prevHeadNode = before;  // = 3
                subTail = current;      // = 4
                prevTailNode = after;   // = 5
            }
            if (i > m && i < n) {
                current.next = before;
            }
            if (i == n && n != m) {
                subHead = current;      // = 4
                subHead.next = before;  // 4.next = 3

                if (prevHeadNode == null) {
                    head = subHead;
                } else {
                    prevHeadNode.next = subHead;    // 3.next = 4
                }

                subTail.next = after;           // 4.next = 5
                prevTailNode.next = subTail;    // 5.next = 4
            }

            i++;
            before = current;
            current = after;
        }
    }


    public void reverseBetweenOk(int m, int n) {

        Node before = null;
        Node current = head;
        int i = 0;

        // aux vars
        Node prevHeadNode = null;
        Node prevTailNode = null;
        Node subHead = null;
        Node subTail = null;

        while (current != null) {

            // Where to move next?
            Node after = current.next;

            if (i == m) {
                prevHeadNode = before;
                subTail = current;
                prevTailNode = after;
            }
            if (i > m && i < n) {
                current.next = before;
            }
            if (i == n) {
                subHead = current;
                subHead.next = before;
                prevHeadNode.next = subHead;
                subTail.next = after;
                prevTailNode.next = subTail;
            }

            i++;
            before = current;
            current = after;
        }
    }
}
