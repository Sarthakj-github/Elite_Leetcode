/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        return bst(head);
    }
    public ListNode mid(ListNode head){
        ListNode p=null,s=head,f=head;
        while(f!=null && f.next!=null){
            p=s;    s=s.next;   f=f.next.next;
        }
        if(p!=null) p.next=null;
        return s;
    }

    public TreeNode bst(ListNode head){
        if(head==null)  return null;
        ListNode m=mid(head);
        TreeNode root= new TreeNode(m.val);
        if(head!=m){
            root.left=bst(head);
            root.right=bst(m.next);
        }
        return root;
    }
}
