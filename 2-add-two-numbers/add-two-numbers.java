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
 import java.math.BigInteger;
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder a1 = new StringBuilder();
        StringBuilder a2 = new StringBuilder();

        while (l1 != null) {
            a1.insert(0, l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            a2.insert(0, l2.val);
            l2 = l2.next;
        }

        BigInteger sum = new BigInteger(a1.toString()).add(new BigInteger(a2.toString()));

        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        
        if (sum.equals(BigInteger.ZERO)) {
            return new ListNode(0); // Handle the case when sum is 0
        }

        while (!sum.equals(BigInteger.ZERO)) {
            int digit = sum.mod(BigInteger.TEN).intValue();
            sum = sum.divide(BigInteger.TEN);
            current.next = new ListNode(digit);
            current = current.next;
        }

        return dummyHead.next;
    }
}