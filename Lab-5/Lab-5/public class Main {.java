public class Main {
    public static void main(String[] args) {
        // Create a new BST
        Tree<Integer> lab5Tree = new BST<>();

        // Insert values into the tree
        int[] values = { 13, 22, 36, 5, 48, 17, 39, 2, 26, 40, 29, 34, 10 };
        for (int val : values) {
            lab5Tree.insert(val);
        }

        // Delete the value 17
        lab5Tree.delete(17);

        // Traverse and output the values using inorder (sorted)
        System.out.print("Inorder (sorted): ");
        lab5Tree.inorder();
        System.out.println();

        // Traverse and output the values using postorder
        System.out.print("Postorder: ");
        lab5Tree.postorder();
        System.out.println();

        // Traverse and output the values using preorder
        System.out.print("Preorder: ");
        lab5Tree.preorder();
        System.out.println();

        // Search for value 36
        System.out.println("Search for 36: " + lab5Tree.search(36));

        // Search for value 37
        System.out.println("Search for 37: " + lab5Tree.search(37));

        // Display path from the root to 2
        System.out.print("Path from root to 2: ");
        ((BST<Integer>) lab5Tree).path(2);

        // Display path from the root to 34
        System.out.print("Path from root to 34: ");
        ((BST<Integer>) lab5Tree).path(34);
    }
}
