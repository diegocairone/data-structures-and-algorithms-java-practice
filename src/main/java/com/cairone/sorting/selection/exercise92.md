Selection Sort of LL ( ** Interview Question)
Implement the Selection Sort algorithm on a singly linked list.

The linked list will contain integer elements.

You are required to write a method selectionSort() within the LinkedList class. This method will sort the linked list in ascending order using the Selection Sort algorithm.

The Selection Sort algorithm works by dividing the list into a sorted and an unsorted region. The sorted region starts out empty and the unsorted region is initially the entire list. The algorithm repeatedly selects the smallest (or largest, depending on sorting order) element from the unsorted region and moves it into the sorted region. When the unsorted region becomes empty, the algorithm stops and the list is sorted.

Here is a brief overview of the steps involved in implementing the selection sort algorithm:

Check if the length of the linked list is less than 2. If it is, the list is already sorted, so the method should return immediately.

Initialize a Node object current to the head of the list.

Set up a while loop that continues as long as current.next is not null.

Within this loop, set smallest to current and innerCurrent to the next node in the list.

While innerCurrent is not null, if innerCurrent's value is less than smallest's value, set smallest to innerCurrent. Then, advance innerCurrent to the next node.

After going through all nodes in the unsorted region, if smallest is not current, swap the values in smallest and current.

Move current to the next node and repeat the process until the entire list is sorted.

At the end of the sort, update the tail of the list to current.



Please ensure your code follows these steps to correctly implement the selection sort method.

Assume that all values in the list are integers. The selectionSort() method should not return any value; it should sort the linked list in-place. That is, it should modify the original linked list rather than creating and returning a new, sorted list.
