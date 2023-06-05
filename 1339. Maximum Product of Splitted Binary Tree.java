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
    List<Integer> L = new ArrayList();
    public int maxProduct(TreeNode root) {
        long tot = trav(root);
        long mx=0;
        for(int i:L)
            mx=Math.max(mx,(tot-i)*i);
        return (int) (mx%(1000000000+7));
    }
    public int trav(TreeNode root){
        int s=root.val;
        if(root.left!=null)
            s+=trav(root.left);
        if(root.right!=null)
            s+=trav(root.right);
        L.add(s);
        return s;
    }
}
