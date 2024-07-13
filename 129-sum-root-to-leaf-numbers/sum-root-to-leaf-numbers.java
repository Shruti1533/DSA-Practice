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
    int ans=0;
    public int sumNumbers(TreeNode root) {
        if(root==null){
            return 0;
        }
        helper(root,0);
        return ans;
    }

    public void helper(TreeNode root,int res){
        if(root==null){
            return ;
        }
        res = res * 10 + root.val;

        if (root.left == null && root.right == null) {
            ans += res;
            return;
        }
        helper(root.left, res);
        helper(root.right, res);
    }
}