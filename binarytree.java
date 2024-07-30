public class binarytree {
    public static class TreeNode {
        public int data;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public static int sumOfNodes(TreeNode root) {
            if (root == null) {
                return 0;
            }
            
            int sum = root.data;
            sum += sumOfNodes(root.left);
            sum += sumOfNodes(root.right);
            
            return sum;
        }
    }
public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        System.out.println(TreeNode.sumOfNodes(root));
}
public void insert(int i) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'insert'");
}
public boolean search(int valueToSearch) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'search'");
}
    
}
