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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new LinkedList<>();
        Queue <TreeNode> q=new LinkedList<>();

        if(root==null){
            return result;
        }

        q.add(root);
        
        while(!q.isEmpty()){
            int size=q.size();
            List <Integer> small=new LinkedList<>();

            for(int i=0;i<size;i++){
                TreeNode temp=q.remove();
                small.add(temp.val);

                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            result.add(small);
        }
        return result;
    }
}