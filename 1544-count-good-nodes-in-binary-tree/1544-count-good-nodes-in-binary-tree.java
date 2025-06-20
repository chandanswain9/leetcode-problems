/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int dfs(TreeNode node, int currMax) {
        if (node == null)
            return 0;

        int good = 0;
        if (node.val >= currMax) {
            good = 1;
            currMax = node.val;
        }
        good += dfs(node.left, currMax);
        good += dfs(node.right, currMax);

        return good;
    }

    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }
}