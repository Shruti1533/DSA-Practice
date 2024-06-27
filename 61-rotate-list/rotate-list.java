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
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Calculate the length of the list
        ListNode curr = head;
        int n = 1;
        while (curr.next != null) {
            curr = curr.next;
            n++;
        }

        // Make the list circular
        curr.next = head;

        // Find the new head position
        k = k % n;
        int places = n - k;
        ListNode tail = head;
        for (int i = 1; i < places; i++) {
            tail = tail.next;
        }

        // Break the circular list to get the new head and tail
        head = tail.next;
        tail.next = null;

        return head;
    }
}