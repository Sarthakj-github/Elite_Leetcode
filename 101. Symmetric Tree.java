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
    public boolean isSymmetric(TreeNode root) {
        return ismirror(root.left,root.right);
    }
    public boolean ismirror(TreeNode left,TreeNode right){
        if(left==null && right==null)
                return true;
        if(left!=null && right!=null)
            if(left.val==right.val)
                if(ismirror(left.left,right.right))
                    if(ismirror(left.right,right.left))
                        return true;
        return false;
    }
}
