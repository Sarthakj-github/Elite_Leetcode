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
    public boolean isValidBST(TreeNode root) {
        return trav(root,-Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY);
    }
    public boolean trav(TreeNode root,double min,double max){
            if(root!=null){
                if(min<root.val && root.val<max)
                    return trav(root.right,root.val,max) && trav(root.left,min,root.val);
                else
                    return false;
            }
            return true;
    }
}
