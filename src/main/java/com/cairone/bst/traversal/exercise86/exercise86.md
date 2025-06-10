BST: Validate BST ( ** Interview Question)
Objective:

Implement a method to validate whether a given binary tree is a correctly formed Binary Search Tree (BST).

Function Signature:
public boolean isValidBST()

Input:
The method does not take any parameters directly; instead, it operates on the binary tree structure encapsulated within the class it is a part of.

Output:
Returns true if the binary tree is a valid BST, according to BST properties.
Returns false if the binary tree violates BST properties.

BST Properties:

A binary tree is considered a valid BST if, for every node in the tree, all of the following conditions hold:

1. The left subtree of a node contains only nodes with keys less than the node's key.
2. The right subtree of a node contains only nodes with keys greater than the node's key.
3. Both the left and right subtrees must also be binary search trees.

Method Description:

In-Order Traversal:

The method begins by performing an in-order traversal of the tree (DFSInOrder method is provided). This process visits nodes in the left subtree, then the root node, and finally nodes in the right subtree.
The result of this traversal is stored in an ArrayList<Integer>, capturing the values of the nodes in the order they were visited.

Validation:

The method iterates through the list of node values starting from the second element. It compares each element with its predecessor to ensure that the sequence of node values is in strict ascending order, which is a direct implication of the BST properties.
If at any point, a node value is found to be less than or equal to the value of its predecessor, it indicates a violation of BST properties, and the method returns false.

Conclusion:

If the entire list is iterated without finding any violations, the method concludes that the tree satisfies all BST properties and returns true, indicating the tree is a valid BST.

Use Case:
This method is particularly useful in scenarios where the integrity of the BST needs to be assured, such as before performing operations that require the BST property to be maintained for efficiency or correctness, including search, insertion, deletion, and data analysis operations.
