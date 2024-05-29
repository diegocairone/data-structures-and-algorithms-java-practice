package com.cairone;

import java.util.StringJoiner;

public class Queue {

    private Node first;
    private Node last;
    private int length;

    public static void main(String[] args) {

    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue() {
        if (length == 0) {
            return null;
        }
        Node tmp = first;
        if (length == 1) {
            first = null;
            last = null;
        } else {
            first = first.next;
            tmp.next = null;
        }
        length--;
        return tmp;
    }

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
}
