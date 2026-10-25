public class BinarySearchTree<T extends Comparable<T>> {

    private BSTNode<T> root;

    public BinarySearchTree() {
        root = null;
    }

    public void add(T element) {
        root = recAdd(element, root);
    }

    private BSTNode<T> recAdd(T element, BSTNode<T> node) {

        // Base case: create a new node
        if (node == null) {
            return new BSTNode<>(element);
        }

        // Smaller or equal values go left
        if (element.compareTo(node.getInfo()) <= 0) {
            node.setLeft(recAdd(element, node.getLeft()));
        } else {
            // Larger values go right
            node.setRight(recAdd(element, node.getRight()));
        }

        return node;
    }
}