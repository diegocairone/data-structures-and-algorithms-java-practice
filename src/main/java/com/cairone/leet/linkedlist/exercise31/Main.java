package com.cairone.leet.linkedlist.exercise31;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Partition List (Doubly Linked List) ===\n");

        System.out.println("Test Case 1: Mixed values around 5");
        DoublyLinkedList dll1 = new DoublyLinkedList(3);
        dll1.append(8);
        dll1.append(5);
        dll1.append(10);
        dll1.append(2);
        dll1.append(1);
        System.out.print("BEFORE: ");
        dll1.printList();  // Expected: 3 <-> 8 <-> 5 <-> 10 <-> 2 <-> 1
        dll1.partitionList(5);
        System.out.print("AFTER:  ");
        dll1.printList();  // Expected: 3 <-> 2 <-> 1 <-> 8 <-> 5 <-> 10

        System.out.println("\nTest Case 2: All nodes less than 5");
        DoublyLinkedList dll2 = new DoublyLinkedList(1);
        dll2.append(2);
        dll2.append(3);
        System.out.print("BEFORE: ");
        dll2.printList();  // Expected: 1 <-> 2 <-> 3
        dll2.partitionList(5);
        System.out.print("AFTER:  ");
        dll2.printList();  // Expected: 1 <-> 2 <-> 3

        System.out.println("\nTest Case 3: All nodes greater than 5");
        DoublyLinkedList dll3 = new DoublyLinkedList(6);
        dll3.append(7);
        dll3.append(8);
        System.out.print("BEFORE: ");
        dll3.printList();  // Expected: 6 <-> 7 <-> 8
        dll3.partitionList(5);
        System.out.print("AFTER:  ");
        dll3.printList();  // Expected: 6 <-> 7 <-> 8

        System.out.println("\nTest Case 4: Empty list");
        DoublyLinkedList dll4 = new DoublyLinkedList(1);
        dll4.makeEmpty();
        System.out.print("BEFORE: ");
        dll4.printList();  // Expected: (empty)
        dll4.partitionList(5);
        System.out.print("AFTER:  ");
        dll4.printList();  // Expected: (empty)

        System.out.println("\nTest Case 5: Single node");
        DoublyLinkedList dll5 = new DoublyLinkedList(1);
        System.out.print("BEFORE: ");
        dll5.printList();  // Expected: 1
        dll5.partitionList(5);
        System.out.print("AFTER:  ");
        dll5.printList();  // Expected: 1

        System.out.println("\n===========================================\n");
    }

}



