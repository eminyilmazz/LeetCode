package Solutions.MaximumDepthofBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Iterative BFS. This has a bug.
 * TreeNode is defined in Solution.java
 * */

public class Solution2 {
    public int maxDepth (TreeNode root) {
        int currentLevel = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode node = root;
        if (root == null) return currentLevel;
        else {
            queue.add(node);
            while (!queue.isEmpty()) {
                for (int i = 0; i < queue.size(); i++) {
                    node = queue.remove();
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
                currentLevel++;
            }
        }
        return currentLevel;
    }
}
