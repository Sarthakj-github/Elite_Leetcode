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
    public int rob(TreeNode root) {
        List<Integer> ans = trav(root);
        return Math.max(ans.get(0),ans.get(1));
    }
    public List<Integer> trav(TreeNode root){
        List<Integer> ans = new ArrayList<>();
        if(root==null){
            ans.add(0); ans.add(0);
            return ans;
        }
        List<Integer> l = trav(root.left);
        List<Integer> r = trav(root.right);
        ans.add(l.get(1)+r.get(1)+root.val);
        ans.add(Math.max(l.get(0),l.get(1))+Math.max(r.get(0),r.get(1)));
        return ans;
    }
}
