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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> L = new ArrayList<Integer>();
        int n=-1;
        if(root==null)
            return L;
        Queue<TreeNode> Q = new LinkedList<TreeNode>();
        Queue<Integer> q = new LinkedList<Integer>();

        int d=0;
        Q.add(root);
        q.add(0);
        while(!Q.isEmpty()){
            root = Q.poll();
            d = q.poll();
            if(root.left!=null){
                Q.add(root.left);
                q.add(d+1);
            }
            if(root.right!=null){
                Q.add(root.right);
                q.add(d+1);
            }
            if(n==d){
                L.set(d,Math.max(root.val,L.get(n)));
            }
            else{
                L.add(root.val);
                n=d;
            }
        }
        return L;
    }
}
