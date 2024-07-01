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
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }

        ListNode middle=mid(head);
        ListNode left=head;
        ListNode right=middle.next;

        middle.next=null;

        left= sortList(left);
        right= sortList(right);

        return merge(left,right);
    }

    public static ListNode merge(ListNode l,ListNode r){
        ListNode dummy = new ListNode(-1); // Dummy node 
        ListNode tail = dummy; // Track the tail of the merged list

        while(l!= null && r != null) {
            if (l.val <= r.val) {
                tail.next = l;
                l = l.next;
            } else {
                tail.next = r;
                r = r.next;
            }
            tail = tail.next;
        }

        if (l != null) {
            tail.next = l;
        }
        if (r != null) {
            tail.next = r;
        }

        return dummy.next; 
    }

    public static ListNode mid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;//For finding 1st middle if even length LL

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

}