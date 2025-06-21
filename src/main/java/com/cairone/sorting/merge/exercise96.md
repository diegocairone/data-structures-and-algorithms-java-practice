LL: Merge Two Sorted Lists ( ** Interview Question)
Description

The merge method takes in another LinkedList as an input and merges it with the current LinkedList. The elements in both lists are assumed to be in ascending order, but the input lists themselves do not need to be sorted.



Parameters

otherList: the other LinkedList to merge with the current list



Return Value

This method does not return a value, but it modifies the current LinkedList to contain the merged list.



Method signature:

public void merge(LinkedList otherList)



Example:



LinkedList l1 = new LinkedList(1);
l1.append(3);
l1.append(5);
l1.append(7);

LinkedList l2 = new LinkedList(2);
l2.append(4);
l2.append(6);
l2.append(8);

l1.merge(l2);

// The current list (l1) now contains the merged list [1, 2, 3, 4, 5, 6, 7, 8]


Details

The merge method works as follows:

It gets the head node of the other linked list (otherList.getHead()) and sets it to a local variable called otherHead.

It creates a new node called dummy with a value of 0, which will serve as the head of the merged linked list.

It creates a new node called current and sets it equal to dummy, which we will use to traverse the merged linked list.

It iterates through both input linked lists as long as they are not null, appending the smaller node to the merged list and updating the head of that list to its next node.

It updates the current node to be the last node in the merged list.

If either of the input lists still has nodes, it appends them to the end of the merged list.

It updates the head of the current list to be the second node in the merged list (since the first node is the dummy node).

It updates the length of the current list to reflect the merged list.



Notes

This method assumes that both the current list and the other list contain elements in ascending order. If this is not the case, the merged list may not be in ascending order.

This method modifies the current list to contain the merged list. If you want to keep the original lists unchanged, you should create a copy of one or both of the lists before calling this method.

This method assumes that the Node class has a getHead method that returns the head node of the linked list, and that the LinkedList class has append, getLength, and printList methods. You may need to modify the implementation depending on the methods available in your classes.
