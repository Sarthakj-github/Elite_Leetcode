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
    int i=0,n=1;
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root= new TreeNode(preorder[this.i++]);
        this.n=preorder.length;
        trav(root,-Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY,preorder);
        return root;
    }
    public void trav(TreeNode root,double min,double max,int[] preorder){
        if(this.i<this.n && min<preorder[this.i] && preorder[this.i]<root.val){
            root.left=new TreeNode(preorder[this.i++]);
            trav(root.left,min,root.val,preorder);
        }
        if(this.i<this.n && root.val<preorder[this.i] && preorder[this.i]<max){
            root.right=new TreeNode(preorder[this.i++]);
            trav(root.right,root.val,max,preorder);
        }
    }
}
