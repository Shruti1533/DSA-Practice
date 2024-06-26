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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode l3 = head;
 
        int carry =0;
        while(l1 != null || l2 != null){
 
            int sum=0;
           
            if(l1 != null){
 
                sum = sum + l1.val;
                l1 = l1.next;
 
            }
 
            if(l2 != null){
 
                sum = sum + l2.val;
                l2 = l2.next;
 
            }
 
            sum = sum + carry;
 
            carry = sum / 10;
            int val = sum % 10;
 
            l3.next = new ListNode(val);
            l3 = l3.next;
 
        }
 
        if(carry == 1){
           
            l3.next = new ListNode(1);
        }
       
        return head.next;
    }
}