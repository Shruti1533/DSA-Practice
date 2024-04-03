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
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
        return null; // If root is null, return null.
    }
    if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if(root.left==null && root.right==null){
                return null;
            }

            if(root.left==null){
                return root.right;
            }
            else if(root.right==null){
                return root.left;
            }
            TreeNode IS=find(root.right);
            root.val=IS.val;
            root.right=deleteNode(root.right,IS.val);
        
        
    }
    return root;
    }

    public static TreeNode find(TreeNode root){
        while(root.left!=null){
                root=root.left;
        }
        return root;
    }
}