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
    private TreeNode xparent = null;
    private TreeNode yparent = null;
    private int xdepth = -1;
    private  int ydepth = -1;
    private void helperFn(TreeNode node, TreeNode parent, int depth, int x, int y){
        if(node == null) {
            return;
        }
        if(node.val == x) {
            xparent = parent;
            xdepth = depth;
        } else if(node.val == y) {
            yparent = parent;
            ydepth = depth;
        }
        if(xdepth != -1 && ydepth != -1){
            return;
        }
        helperFn(node.left,node,depth+1,x,y);
        helperFn(node.right,node,depth+1,x,y);
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        helperFn(root, null, 0, x, y);
        if(xparent != yparent && xdepth == ydepth) {
            return true;
        }
        return false;
    }
}