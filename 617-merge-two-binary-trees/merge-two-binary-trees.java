/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        queue1.add(root1);
        queue2.add(root2);

        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            TreeNode node1 = queue1.poll();
            TreeNode node2 = queue2.poll();

            if (node2 == null) continue;

            node1.val += node2.val;

            // Handle left children
            if (node1.left == null) {
                node1.left = node2.left;
            } else if (node2.left != null) {
                queue1.add(node1.left);
                queue2.add(node2.left);
            }

            // Handle right children
            if (node1.right == null) {
                node1.right = node2.right;
            } else if (node2.right != null) {
                queue1.add(node1.right);
                queue2.add(node2.right);
            }
        }

        return root1;
    }
}