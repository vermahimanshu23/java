public class searchnode {

public static void main(String[] args) {
    // Create a binary search tree
    BinarySearchTree bst = new BinarySearchTree();

    // Insert values into the tree
    bst.insert(5);
    bst.insert(3);
    bst.insert(7);
    bst.insert(2);
    bst.insert(4);
    bst.insert(6);
    bst.insert(8);

    // Search for a value in the tree
    int valueToSearch = 4;
    boolean found = bst.search(valueToSearch);

    if (found) {
        System.out.println(valueToSearch + " is found in the tree.");
    } else {
        System.out.println(valueToSearch + " is not found in the tree.");
    }
}
}
