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
private TreeNode buildTree(int[] nums,int left, int right) {
    if(left >= right) {
        return null;
    }
    int maxIdx = left;
    for(int i = left; i < right; i++) {
        if(nums[i] > nums[maxIdx]) {
            maxIdx = i;
        }
    }

    TreeNode root = new TreeNode(nums[maxIdx]);
    root.left = buildTree(nums, left, maxIdx);
    root.right = buildTree(nums, maxIdx + 1, right);

    return root;
}
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTree(nums, 0, nums.length);
    }
}