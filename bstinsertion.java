class Node {
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }

    public boolean search(int value) {
        if (key == value) {
            return true;
        } else if (value < key && left != null) {
            return left.search(value);
        } else if (value > key && right != null) {
            return right.search(value);
        } else {
            return false;
        }
    }
    public Node delete(int value){
        if (value < key) {
            if (left != null) {
                left = left.delete(value);
            }
        } else if (value > key) {
            if (right != null) {
                right = right.delete(value);
            }
        } else {
            if (left == null) {
                return right;
            } else if (right == null) {
                return left;
            }
            key = right.minValue();
            right = right.delete(key);
        }
        return this;
    }

    private int minValue() {
        if (left == null) {
            return key;
        } else {
            return left.minValue();
        }
    }
}

class bstinsertion {
    static Node insert(Node root, int key)
    {
        if (root == null)
            return new Node(key);
        if (root.key == key)
            return root;
        if (key < root.key)
            root.left = insert(root.left, key);
        else
            root.right = insert(root.right, key);

        return root;
    }
    static void inorder(Node root)
    {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.key + " ");
            inorder(root.right);
        }
    }
     
    public static void main(String[] args)
    {
        Node root = null;

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);
        inorder(root);


        int valueToSearch = 40;
        
        boolean found = root.search(valueToSearch);
        System.out.println("Here we can see  the node ");

    if (found) {
        System.out.print(valueToSearch + " is found in the tree.");
    } else {
        System.out.print(valueToSearch + " is not found in the tree.");
    }
    }
}
