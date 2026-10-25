# Digital Archive BST Journal

## Phase 1: Foundation (Nodes and Insertion)

In Phase 1, I created the BSTNode class to store artifact accession IDs and references to left and right child nodes.

I also created the BinarySearchTree class with a recursive add method that inserts new values into the correct position.

The add method compares each new accession ID to the current node. If the new value is less than or equal to the current value, it moves left. If it is greater, it moves right. This process continues until an empty position is found, where a new node is created.

The Comparable interface is required because it allows the tree to compare generic values using compareTo(). This makes the tree reusable with different data types while maintaining the Binary Search Tree property.

I tested the program by inserting seven sample accession IDs and confirming that the program ran successfully.

