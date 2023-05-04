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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> Q = new LinkedList<TreeNode>();
        Q.add(root);
        while(!Q.isEmpty()){
            TreeNode a = Q.poll();
            if(a==null) break;
            Q.add(a.left);
            Q.add(a.right);
        }
        while(!Q.isEmpty()){
            if(Q.poll()!=null) return false;
        }
        return true;
    }
}
