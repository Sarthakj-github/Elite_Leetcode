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
    public int minDepth(TreeNode root) {
        if(root==null)  return 0;
        return trav(root);
    }
    public int trav(TreeNode root){
        if(root.left==null && root.right==null) return 1;
        int a=100000,b=100000;
        if(root.left!=null)
            a=trav(root.left);
        if(root.right!=null)
            b=trav(root.right);
        
        return Math.min(a,b)+1;
    }
}
