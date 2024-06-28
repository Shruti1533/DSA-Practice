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
    public int getDecimalValue(ListNode head) {
        StringBuilder s=new StringBuilder();
        int length=0;
        while(head!=null){
            int value=head.val;
            s.append(value);
            length++;
            head=head.next;
        }
        String binary=s.toString();
        int decimal= 0;
        
        for (int i = 0; i < length; i++) {
            int bit = binary.charAt(i) - '0';
            decimal = decimal * 2 + bit;
        }
        
        return decimal;
    }
}