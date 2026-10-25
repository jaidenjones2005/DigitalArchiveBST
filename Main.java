public class Main {

    public static void main(String[] args) {

        System.out.println("=== Digital Archive BST ===");

        BinarySearchTree<Integer> archive =
                new BinarySearchTree<>();

        int[] sampleIds = {50, 25, 75, 10, 30, 60, 85};

        for (int id : sampleIds) {
            archive.add(id);
        }

        System.out.println("Archive initialized with sample IDs.");
        System.out.println("Total IDs inserted: " + sampleIds.length);

        // Phase 2: Tree height
        System.out.println("\n=== Archive Tree Height ===");

        System.out.println("Tree Height: " + archive.height());

        // Phase 3: Tree traversals
        System.out.println("\n=== Catalog Audits ===");

        System.out.print("Inorder Traversal: ");
        archive.inOrderTraversal();

        System.out.print("Preorder Traversal: ");
        archive.preOrderTraversal();
    }
}