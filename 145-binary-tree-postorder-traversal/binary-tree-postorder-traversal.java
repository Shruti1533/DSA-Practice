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
    public List<Integer> postorderTraversal(TreeNode root) {
       List <Integer> l=new ArrayList<>();
        
        if(root==null){
            return l;
        }

        postorderhelper(root,l);
        return l;
    }

    public static void postorderhelper(TreeNode root,List <Integer> l){
        if(root==null){
            return ;
        }

        postorderhelper(root.left, l);
        postorderhelper(root.right, l);
        l.add(root.val);
    }
}