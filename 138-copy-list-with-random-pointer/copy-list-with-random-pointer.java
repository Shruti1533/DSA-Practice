/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        HashMap<Node, Node> map = new HashMap<>();

        Node dummy = new Node(-1);
        Node newNode = dummy;
        Node curr = head;

        if (head == null) {//Edge case
            return null;
        }

        while (curr != null) {
            newNode.next = new Node(curr.val); // Create a new node with the same value as curr, i.e copy of all original nodes
            newNode = newNode.next;
            curr = curr.next;
        }
        
        curr=head;
        Node copy=dummy.next;
        while(curr!=null){//Map original nodes with new copied nodes
            map.put(curr,copy);
            curr = curr.next;   
            copy = copy.next;
        }

        curr=head;
        copy=dummy.next;
        while(curr!=null){//Link the random pointers
            copy.random=map.get(curr.random);
            curr=curr.next;
            copy=copy.next;
        }

        return dummy.next;

    }
}