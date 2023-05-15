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
    int total=0;
    public TreeNode convertBST(TreeNode root) {
        trav(root);
        return root;
    }
    public void trav(TreeNode root){
        if(root!=null){
            trav(root.right);
            this.total+=root.val;
            root.val=this.total;
            trav(root.left);
        }
    }
}
