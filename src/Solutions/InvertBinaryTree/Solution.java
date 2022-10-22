package Solutions.InvertBinaryTree;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
    }
}

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        } else {
            TreeNode temp;
            temp = root.right;
            root.right = root.left;
            root.left = temp;

            invertTree(root.right);
            invertTree(root.left);
        }
        return root;
    }
}
