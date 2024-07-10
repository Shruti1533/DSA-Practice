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
    public List<Integer> inorderTraversal(TreeNode root) {
        List <Integer> l=new ArrayList<>();
        
        if(root==null){
            return l;
        }

        inorderhelper(root,l);
        return l;
    }

    public static void inorderhelper(TreeNode root,List <Integer> l){
        if(root==null){
            return ;
        }

        inorderhelper(root.left, l);
        l.add(root.val);
        inorderhelper(root.right, l);
    }
}