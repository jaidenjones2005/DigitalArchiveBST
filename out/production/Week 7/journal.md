# Digital Archive BST Journal

## Phase 1: Foundation (Nodes and Insertion)

In Phase 1, I created the BSTNode class to store artifact accession IDs and references to left and right child nodes.

I also created the BinarySearchTree class with a recursive add method that inserts new values into the correct position.

The add method compares each new accession ID to the current node. If the new value is less than or equal to the current value, it moves left. If it is greater, it moves right. This process continues until an empty position is found, where a new node is created.

The Comparable interface is required because it allows the tree to compare generic values using compareTo(). This makes the tree reusable with different data types while maintaining the Binary Search Tree property.

I tested the program by inserting seven sample accession IDs and confirming that the program ran successfully.

## Phase 2: Archive Depth (Tree Height)

In Phase 2, I added a height() method to the BinarySearchTree class to calculate the maximum depth of the tree.

The method uses recursion to examine both the left and right subtrees. When it reaches a null node, it returns -1. Otherwise, it calculates the height of each subtree and adds one to the larger value.

This allows the program to find the deepest branch of the tree. The root starts at Level 0, and each additional level increases the height by one.

I tested the method using the seven sample accession IDs and confirmed that the tree height was 2.

This phase helped me understand how recursive methods can break a tree into smaller subtrees to calculate its overall height.

## Phase 3: Catalog Audits (Traversals)

In Phase 3, I implemented Inorder and Preorder traversal methods in the BinarySearchTree class.

The Inorder traversal visits the left subtree first, then the current node, and finally the right subtree. Because a Binary Search Tree stores smaller values on the left and larger values on the right, this traversal naturally prints the accession IDs in ascending order.

The Preorder traversal visits the current node first, followed by its left and right subtrees. This allows the program to display the hierarchical structure of the tree.

I tested both traversal methods using the seven sample accession IDs and verified that the results matched the expected order.

This phase helped me understand how recursion can visit tree nodes in different sequences without changing the underlying tree structure.

