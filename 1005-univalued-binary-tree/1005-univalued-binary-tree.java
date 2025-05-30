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
    private static boolean helper(TreeNode node, int data) {
        if(node == null){
            return true;
        }
        if(node.val != data){
            return false;
        }
        return helper(node.left,data) && helper(node.right,data);
    }
    public boolean isUnivalTree(TreeNode root) {
        int data = root.val;
        return helper(root, data);
    }
}