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
    int ans = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        diameterHelper(root);
        
        return ans;
    }
    
    private int diameterHelper(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        int leftHeight = diameterHelper(node.left);
        int rightHeight = diameterHelper(node.right);
        
        ans = Math.max(ans, leftHeight + rightHeight);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
    }
