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
    HashMap<Integer,Integer> d = new HashMap<>();

    public int[] findMode(TreeNode root) {
        trav(root);
        List<Integer> L = new LinkedList<Integer>();
        int mx = 0;
        for(int i:this.d.keySet()){
            if(this.d.get(i)>=mx){
                if(this.d.get(i)>mx) L.clear();
                L.add(i);
                mx=this.d.get(i);
            }
        }
        int n = L.size();
        int[] ans = new int[n];
        for(int i=0;i<n;i++)
            ans[i]=L.get(i);
        return ans;
    }
    public void trav(TreeNode root){
        if(root!=null){
            trav(root.left);
            if(this.d.containsKey(root.val))
                this.d.replace(root.val,this.d.get(root.val)+1);
            else
                this.d.put(root.val,1);
            trav(root.right);
        }
    }
}
