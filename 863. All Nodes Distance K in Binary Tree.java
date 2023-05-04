/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<TreeNode,TreeNode> d = new HashMap<>();
    public void trav(TreeNode par,TreeNode root){
            this.d.put(root,par);
            if(root.left!=null)
                trav(root,root.left);
            if(root.right!=null)
                trav(root,root.right);
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        trav(null,root);
        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(target);
        Set<TreeNode> s = new HashSet<>();
        s.add(target);
        int n=0,p=1,q=0;
        while(!Q.isEmpty() && k!=n){
            while(p!=0){
                TreeNode a=Q.poll();
                if(d.get(a)!=null && !s.contains(d.get(a))){
                    s.add(d.get(a));
                    Q.add(d.get(a));
                    q+=1;
                }
                if(a.left!=null && !s.contains(a.left)){
                    s.add(a.left);
                    Q.add(a.left);
                    q+=1;
                }
                if(a.right!=null && !s.contains(a.right)){
                    s.add(a.right);
                    Q.add(a.right);
                    q+=1;
                }
                p-=1;
            }
            p=q;    q=0;    n+=1;
        }
        List<Integer> L = new ArrayList<>();
        while(!Q.isEmpty()){
            L.add(Q.poll().val);
        }
        return L;
    }
}
