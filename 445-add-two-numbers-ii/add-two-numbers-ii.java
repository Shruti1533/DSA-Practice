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

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while(l1!=null){
            s1.push(l1.val);
            l1=l1.next;
        }
        while(l2!=null){
            s2.push(l2.val);
            l2=l2.next;
        }

        ListNode result = null;
        int carry = 0;
        
        // Process both stacks until they are empty
        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
            int sum = carry;
            
            if (!s1.isEmpty()) sum += s1.pop();
            if (!s2.isEmpty()) sum += s2.pop();
            
            carry = sum / 10;
            sum = sum % 10;
            
            // Create a new node with the sum and add it to the front of the result list
            ListNode newNode = new ListNode(sum);
            newNode.next = result;
            result = newNode;
        }
        
        return result;
    }
}