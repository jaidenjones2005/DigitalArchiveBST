public class BinarySearchTree<T extends Comparable<T>> {

    private BSTNode<T> root;

    public BinarySearchTree() {
        root = null;
    }

    // Phase 1: Insert elements into BST
    public void add(T element) {
        root = recAdd(element, root);
    }

    private BSTNode<T> recAdd(T element, BSTNode<T> node) {

        if (node == null) {
            return new BSTNode<>(element);
        }

        if (element.compareTo(node.getInfo()) <= 0) {
            node.setLeft(recAdd(element, node.getLeft()));
        } else {
            node.setRight(recAdd(element, node.getRight()));
        }

        return node;
    }

    // Phase 2: Calculate tree height
    public int height() {
        return recHeight(root);
    }

    private int recHeight(BSTNode<T> node) {

        // Empty tree has height -1
        if (node == null) {
            return -1;
        }

        // Calculate left and right subtree heights
        int leftHeight = recHeight(node.getLeft());
        int rightHeight = recHeight(node.getRight());

        // Return height of deepest branch
        return 1 + Math.max(leftHeight, rightHeight);
    }
}