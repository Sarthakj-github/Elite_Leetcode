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
    List<List<Integer>> L = new ArrayList<>(); 
    int n=-1;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        trav(root,0);
        return this.L;
    }
    
    public void trav(TreeNode root,int c){
        if(root!=null){
            if(this.n>=c){
                if(c%2!=0)
                    (this.L.get(c)).add(0,root.val);
                else
                    this.L.get(c).add(root.val);
            }
            else{
                List<Integer> l = new ArrayList<>();
                l.add(root.val);
                this.L.add(l);
                this.n++;
            }
            trav(root.left,c+1);
            trav(root.right,c+1);
        }
    }
}
