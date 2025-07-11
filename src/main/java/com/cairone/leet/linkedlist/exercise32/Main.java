package com.cairone.leet.linkedlist.exercise32;

public class Main {

    public static void main(String[] args) {

        System.out.println("Test 1: Middle segment reversal");
        DoublyLinkedList dll1 = new DoublyLinkedList(3);
        dll1.append(8);
        dll1.append(5);
        dll1.append(10);
        dll1.append(2);
        dll1.append(1);
        System.out.print("BEFORE: ");
        dll1.printList();
        dll1.reverseBetween(1, 4);
        System.out.print("AFTER:  ");
        dll1.printList();

        System.out.println("\nTest 2: Full list reversal");
        DoublyLinkedList dll2 = new DoublyLinkedList(1);
        dll2.append(2);
        dll2.append(3);
        dll2.append(4);
        dll2.append(5);
        System.out.print("BEFORE: ");
        dll2.printList();
        dll2.reverseBetween(0, 4);
        System.out.print("AFTER:  ");
        dll2.printList();

        System.out.println("\nTest 3: No-op on single node");
        DoublyLinkedList dll3 = new DoublyLinkedList(9);
        System.out.print("BEFORE: ");
        dll3.printList();
        dll3.reverseBetween(0, 0);
        System.out.print("AFTER:  ");
        dll3.printList();

        System.out.println("\nTest 4: Head included in reversal");
        DoublyLinkedList dll4 = new DoublyLinkedList(7);
        dll4.append(8);
        dll4.append(9);
        System.out.print("BEFORE: ");
        dll4.printList();
        dll4.reverseBetween(0, 2);
        System.out.print("AFTER:  ");
        dll4.printList();

    }

}



