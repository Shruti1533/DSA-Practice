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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList <String> s=new ArrayList<>();
        
        if(root==null){
            return s;
        }
        
        helper(root,"",s);
    
        return s;
    }

    public static void helper(TreeNode root,String path,ArrayList <String> s){
        if (root != null) {
            path += root.val;
            if (root.left == null && root.right == null) 
            {  // If it's a leaf node
                s.add(path);  // Add path 
            } 
            else 
            {
                path += "->"; 
                helper(root.left, path, s);  
                helper(root.right, path, s); 
            }
        }
    }
}