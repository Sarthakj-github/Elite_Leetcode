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
    public int countNodes(TreeNode root) {
        return count(root);
    }
    
    public int height_lr(TreeNode root,boolean f){
        int c=0;
        while(root!=null){
            if(f)   root=root.left;
            else    root=root.right;
            c++;
        }
        return c;
    }

    public int count(TreeNode root){
        int cl=height_lr(root,true);
        int cr=height_lr(root,false);
        if(cl==cr)
            return (int)Math.pow(2,cl) - 1;
        return 1+count(root.left)+count(root.right);
    }
}
