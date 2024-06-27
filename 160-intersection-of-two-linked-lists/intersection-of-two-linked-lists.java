/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode, Integer> map = new HashMap<>();
        ListNode h1 = headA;
        ListNode h2 = headB;

        // Traverse list A and store the nodes in the map
        while (h1 != null) {
            map.put(h1, 1);
            h1 = h1.next;
        }

        // Traverse list B and check for intersection with nodes in the map
        while (h2 != null) {
            if (map.containsKey(h2)) {
                return h2; // Intersection node found
            }
            h2 = h2.next;
        }

        return null; // No intersection node
    }
}