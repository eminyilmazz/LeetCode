package Solutions.MaximumDepthofBinaryTree;

/**
 * Recursive DFS solution.
 * */
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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        else {
            return 1 + Integer.max(maxDepth(root.left), maxDepth(root.right));
        }
    }
}

