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
    List<Integer> L = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        trav(root);
        return solve(0,this.L.size()-1);
    }

    public TreeNode solve(int l,int r){
        if(l<=r){
            int m= (int) ((l+r)/2);
            TreeNode node= new TreeNode(this.L.get(m));
            if((m-l)!=0)
                node.left=solve(l,m-1);
            if((r-m)!=0)
                node.right=solve(m+1,r);
            return node;
        }
        return null;
    }

    public void trav(TreeNode root){
        if(root!=null){
            trav(root.left);
            L.add(root.val);
            trav(root.right);
        }
    }
}
