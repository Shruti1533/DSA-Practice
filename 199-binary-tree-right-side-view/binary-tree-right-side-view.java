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
    List<Integer> result = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return result;
        }
        
        dfs(root, 0);
        return result;
    }

    private void dfs(TreeNode node, int depth) {
        if (depth == result.size()) {
            result.add(node.val); // Add the rightmost node value at this level
        }

        if (node.right != null) {
            dfs(node.right, depth + 1); // Traverse right subtree first
        }
        if (node.left != null) {
            dfs(node.left, depth + 1); // Traverse left subtree
        }
}
}