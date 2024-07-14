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
    public boolean hasPathSum(TreeNode root, int targetSum) {
       int sum=0;
       boolean ans=false;

       if(root==null ){
        return false;
       } 

       if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        boolean leftHasPath = hasPathSum(root.left, targetSum - root.val);
        boolean rightHasPath = hasPathSum(root.right, targetSum - root.val);

        return leftHasPath || rightHasPath;
    }
}