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
    int c=0;
    public int distributeCoins(TreeNode root) {
        trav(root);
        return this.c;
    }
    public int trav(TreeNode root){
        int a=0,b=0;
        if(root.left!=null){
            a=trav(root.left);
            this.c+=Math.abs(a);
        }
        if(root.right!=null){
            b=trav(root.right);
            this.c+=Math.abs(b);
        }
        return a+b+root.val-1;
    }
}
