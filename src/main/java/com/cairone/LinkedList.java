package com.cairone;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class LinkedList {

    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(10);
        myLinkedList.append(5);
        myLinkedList.append(16); // <- idx 2
        myLinkedList.append(6); // <- idx 3
        myLinkedList.append(1);

        myLinkedList.printAll();
        myLinkedList.insert(5, 13);

        myLinkedList.printAll();
    }

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node node = new Node(value);
        this.head = node;
        this.tail = node;
        this.length = 1;

    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }
        Node temp = head;
        head = head.next;
        length--;
        temp.next = null;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        if (length == 1) {
            Node pre = head;
            head = null;
            tail = null;
            length = 0;
            return pre;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            Node pre = temp.next;
            temp.next = null;
            tail = temp;
            length--;
            return pre;
        }
    }

    public void prepend(int value) {
        Node prepended = new Node(value);
        if (length == 0) {
            head = prepended;
            tail = prepended;
        } else {
            prepended.next = head;
            head = prepended;
        }
        length++;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node current = head;
        int i = 0;
        while (current.next != null) {
            if (i == index) {
                return current;
            }
            current = current.next;
            i++;
        }
        return tail;
    }

    public boolean set(int index, int value) {
        Node node = get(index);
        if (node == null) {
            return false;
        }
        node.value = value;
        return true;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        } else if (index == 0) {
            prepend(value);
            return true;
        } else if (index == length - 1) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node prev = get(index - 1);
        newNode.next = prev.next;
        prev.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        } else if (index == 0) {
            return removeFirst();
        } else if (index == length - 1) {
            return removeLast();
        }
        Node prev = get(index - 1);
        Node toBeRemoved = prev.next;
        prev.next = toBeRemoved.next;
        toBeRemoved.next = null;
        length--;
        return toBeRemoved;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            log.info("{}", temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            log.info("Head: null");
            log.info("Tail: null");
        } else {
            log.info("Head: {}", head.value);
            log.info("Tail: {}", tail.value);
        }
        log.info("Length: {}", length);
        log.info("Linked List:");

        if (length == 0) {
            log.info("empty");
        } else {
            printList();
        }
    }

    class Node {

        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
