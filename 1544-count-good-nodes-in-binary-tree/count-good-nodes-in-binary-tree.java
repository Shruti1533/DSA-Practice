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
    public int goodNodes(TreeNode root) {
        int max=Integer.MIN_VALUE;
        int ans=helper(root,max);

        return ans;
    }

    //Computed at stack falling in recursion
    public static int helper(TreeNode node, int max){
        if(node==null){
            return 0;
        }

        int l=helper(node.left,Math.max(max,node.val));
        int r=helper(node.right,Math.max(max,node.val));

        int result=l+r;
        if(node.val>=max){
            result=result+1;
        }
        return result;
    }
}