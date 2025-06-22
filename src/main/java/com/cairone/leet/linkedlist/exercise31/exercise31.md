DLL: Partition List ( ** Interview Question)
Write a method called partitionList that rearranges the nodes in a doubly linked list so that all nodes with values less than a given number x come before nodes greater than or equal to x.

This must be done by relinking the existing nodes (not by creating new ones). The method should update both .next and .prev pointers correctly.

The relative order of nodes within each partition must be preserved.





📌 Example Inputs and Outputs:

Input:  3 <-> 8 <-> 5 <-> 10 <-> 2 <-> 1, x = 5
Output: 3 <-> 2 <-> 1 <-> 8 <-> 5 <-> 10

Input: 1 <-> 2 <-> 3, x = 5
Output: 1 <-> 2 <-> 3

Input: 6 <-> 7 <-> 8, x = 5
Output: 6 <-> 7 <-> 8




📘 What This Exercise Is Designed to Teach

How to traverse and manipulate nodes in a doubly linked list.

Maintaining correct .prev and .next pointers while restructuring.

Use of dummy nodes to simplify head handling.
