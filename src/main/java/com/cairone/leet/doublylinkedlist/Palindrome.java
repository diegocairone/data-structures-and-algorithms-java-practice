package com.cairone.leet.doublylinkedlist;

/**
 * DLL: Palindrome Checker ( ** Interview Question)
 * Write a method to determine whether a given doubly linked list reads the same forwards and backwards.
 *
 * For example, if the list contains the values [1, 2, 3, 2, 1], then the method should return true, since the list is a palindrome.
 *
 * If the list contains the values [1, 2, 3, 4, 5], then the method should return false, since the list is not a palindrome.
 *
 * Method name: isPalindrome
 *
 * Return Type: boolean
 */
public class Palindrome {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public Palindrome(int value) {
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
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append (int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public boolean isPalindrome() {
        boolean isPalindrome = true;
        Node forward = head;
        Node backward = tail;

        while (forward != null) {

            if (forward.value != backward.value) {
                isPalindrome = false;
                break;
            }
            forward = forward.next;
            backward = backward.prev;
        }

        return isPalindrome;
    }

    public static void main(String[] args) {
        Palindrome list = new Palindrome(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(4);
        list.append(2);
        list.append(1);
        boolean rv = list.isPalindrome();
        System.out.println("Result: " + rv);
    }
}
