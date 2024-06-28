/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || head.next == null) {
            return head;
        }

        int count = 1;
        ListNode curr = head;
        ListNode prev = null;

        // Move curr to the left position
        while (count < left) {
            prev = curr;
            curr = curr.next;
            count++;
        }

        ListNode start = curr;
        ListNode tail = curr;
        while (count < right) {
            tail = tail.next;
            count++;
        }

        ListNode temp = tail.next;
        tail.next = null; // Break the list

        // Reverse the portion from left to right
        ListNode newHead = reverse(start);
        if (prev != null) {
            prev.next = newHead;
        } else {
            head = newHead; // Update head if the reverse portion includes the first node
        }

        // Move to the end of the reversed list
        curr = newHead;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;

        return head;
    }

    public ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;
        ListNode temp = null;

        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
