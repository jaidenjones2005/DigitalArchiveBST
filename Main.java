public class Main {

    public static void main(String[] args) {

        System.out.println("=== Digital Archive BST ===");

        // Original sample tree
        BinarySearchTree<Integer> archive =
                new BinarySearchTree<>();

        int[] sampleIds = {50, 25, 75, 10, 30, 60, 85};

        for (int id : sampleIds) {
            archive.add(id);
        }

        System.out.println("\n=== Original Archive ===");
        System.out.println("Archive initialized with sample IDs.");
        System.out.println("Total IDs inserted: " + sampleIds.length);
        System.out.println("Tree Height: " + archive.height());

        System.out.print("Inorder Traversal: ");
        archive.inOrderTraversal();

        System.out.print("Preorder Traversal: ");
        archive.preOrderTraversal();

        // TEST 1: Empty tree
        System.out.println("\n=== Test 1: Empty Tree ===");

        BinarySearchTree<Integer> emptyTree =
                new BinarySearchTree<>();

        System.out.println("Empty Tree Height: " + emptyTree.height());

        System.out.print("Inorder: ");
        emptyTree.inOrderTraversal();

        System.out.print("Preorder: ");
        emptyTree.preOrderTraversal();

        if (emptyTree.height() == -1) {
            System.out.println("PASS: Empty tree height is correct.");
        } else {
            System.out.println("FAIL: Empty tree height is incorrect.");
        }

        // TEST 2: Single-node tree
        System.out.println("\n=== Test 2: Single-Node Tree ===");

        BinarySearchTree<Integer> singleTree =
                new BinarySearchTree<>();

        singleTree.add(100);

        System.out.println("Single Tree Height: " + singleTree.height());

        System.out.print("Inorder: ");
        singleTree.inOrderTraversal();

        System.out.print("Preorder: ");
        singleTree.preOrderTraversal();

        if (singleTree.height() == 0) {
            System.out.println("PASS: Single-node tree height is correct.");
        } else {
            System.out.println("FAIL: Single-node tree height is incorrect.");
        }

        // TEST 3: Skewed tree
        System.out.println("\n=== Test 3: Skewed Tree ===");

        BinarySearchTree<Integer> skewedTree =
                new BinarySearchTree<>();

        int[] sortedIds = {10, 20, 30, 40};

        for (int id : sortedIds) {
            skewedTree.add(id);
        }

        System.out.println("Skewed Tree Height: " + skewedTree.height());

        System.out.print("Inorder: ");
        skewedTree.inOrderTraversal();

        System.out.print("Preorder: ");
        skewedTree.preOrderTraversal();

        if (skewedTree.height() == 3) {
            System.out.println("PASS: Skewed tree height is correct.");
        } else {
            System.out.println("FAIL: Skewed tree height is incorrect.");
        }

        System.out.println("\n=== Phase 4 Complete ===");
    }
}