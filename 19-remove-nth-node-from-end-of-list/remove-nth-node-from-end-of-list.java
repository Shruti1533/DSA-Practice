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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;

        if(head==null){
            return null;
        }

        ListNode curr=head;

        while(curr!=null){
            count++;
            curr=curr.next;
        }

        // If the node to remove is the head
        if(count==n){
            return head.next;
        }

        count=count-n;
        curr=head;
        for(int i=1;i<count;i++){
            curr=curr.next;
        }

        curr.next=curr.next.next;

        return head;
    }
}