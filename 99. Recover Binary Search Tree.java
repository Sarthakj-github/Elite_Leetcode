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
    List<TreeNode> L = new ArrayList();
    public void recoverTree(TreeNode root) {
        trav(root);
        int n = this.L.size();
        TreeNode x = null,y = null;
        for(int i=0;i<(n-1);i++){
            if(this.L.get(i).val>this.L.get(i+1).val){
                y=this.L.get(i+1);
                if(x==null) x=this.L.get(i);
            }
        }
        int temp = x.val;
        x.val = y.val;
        y.val=temp;
    }
    public void trav(TreeNode root){
        if(root!=null){
            trav(root.left);
            this.L.add(root);
            trav(root.right);
        }
    }
}
