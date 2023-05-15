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
    double prev=Double.POSITIVE_INFINITY,m=Double.POSITIVE_INFINITY;
    public int minDiffInBST(TreeNode root) {
        trav(root);
        return (int)this.m;
    }
    public void trav(TreeNode root){
        if(root!=null){
            trav(root.left);
            this.m=Math.min(this.m,Math.abs(this.prev-root.val));
            this.prev=root.val;
            trav(root.right);
        }
    }
}
