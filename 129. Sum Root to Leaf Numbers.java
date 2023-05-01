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
    public int sumNumbers(TreeNode root) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        Stack<Integer> i = new Stack<Integer>();
        s.push(root);
        i.push(root.val);
        int ans=0;
        while(!s.isEmpty()){
            TreeNode a= s.pop();
            int b=i.pop();
            if(a.left==null && a.right==null){
                ans+=b;
                continue;
            }
            if(a.left!=null){
                s.push(a.left);
                i.push(b*10+a.left.val);
            }
            if(a.right!=null){
                s.push(a.right);
                i.push(b*10+a.right.val);
            }
        }
        return ans;
    }
}
