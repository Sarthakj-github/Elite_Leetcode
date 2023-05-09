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
    List<String> A= new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        trav(root,"");
        return this.A;
    }
    
    public void trav(TreeNode root,String s){
        s=s.concat(Integer.toString(root.val));
        if(root.left==null && root.right==null)
                this.A.add(s);
        s=s.concat("->");
        if(root.left!=null)
            trav(root.left,s);
        if(root.right!=null)
            trav(root.right,s);
    }
}
