package com.cairone.leet.linkedlist;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MiddleNodeLinkedList {

    private Node head;
    private Node tail;

    public class Node {
        public int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.format("value: %s [next: %s]", value, next == null ? "null" : next.value);
        }
    }

    public MiddleNodeLinkedList(int value) {
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

    public Node findMiddleNode() {
        Node slow = head;
        Node fast = head;
        int i = 0;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            log.info("i = {} - slow: {} - fast: {}", i, slow, fast);
            i++;
        }

        return slow;
    }

    public static void main(String[] args) {
        MiddleNodeLinkedList myList = new MiddleNodeLinkedList(1);
        myList.append(2);
        myList.append(3);

        myList.append(4); // <-
        myList.append(5);
        myList.append(6);
        myList.append(7);
        myList.append(8);
        myList.append(9);
        myList.append(10);

        Node middleNode = myList.findMiddleNode();
        System.out.println(middleNode.value); // Output: 4
    }
}
