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
    TreeNode p_x=null,p_y=null;
    int d_x=-1,d_y=-1;
    public boolean isCousins(TreeNode root, int x, int y) {
        trav(null,root,0,x,y);
        if(this.p_x!=this.p_y && this.d_x==this.d_y)
            return true;
        return false;
    }
    public void trav(TreeNode par,TreeNode root,int d,int x,int y){
            if(root.val==x){
                this.p_x=par;
                this.d_x=d;
            }
            if(root.val==y){
                this.p_y=par;
                this.d_y=d;
            }
            if(root.left!=null && (this.d_x==-1 || this.d_y==-1))
                trav(root,root.left,d+1,x,y);
            if(root.right!=null && (this.d_x==-1 || this.d_y==-1))
                trav(root,root.right,d+1,x,y);
    }
}
