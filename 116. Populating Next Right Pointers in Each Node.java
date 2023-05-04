/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        Node R=root;
        if(R==null)
            return R;
        Queue<Node> Q = new LinkedList<Node>();
        Queue<Integer> q = new LinkedList<Integer>();
        int d=0;
        Q.add(root);
        q.add(0);
        while(!Q.isEmpty()){
            root = Q.poll();
            d = q.poll();
            if(!q.isEmpty() && q.peek()==d)
                root.next=Q.peek();
            if(root.left!=null){
                Q.add(root.left);
                q.add(d+1);
            }
            if(root.right!=null){
                Q.add(root.right);
                q.add(d+1);
            }
        }
        return R;
    }
}
