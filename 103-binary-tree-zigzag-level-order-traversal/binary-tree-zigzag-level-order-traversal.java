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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> l = new ArrayList<>();
        if (root == null) {
            return l;
        }

        List<Integer> small;
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        boolean leftToRight = true;

        s1.push(root);

        while (!s1.isEmpty() || !s2.isEmpty()) {
            small = new ArrayList<>();

            if (leftToRight) {
                while (!s1.isEmpty()) {
                    TreeNode temp = s1.pop();
                    small.add(temp.val);

                    if (temp.left != null) {
                        s2.push(temp.left);
                    }
                    if (temp.right != null) {
                        s2.push(temp.right);
                    }
                }
            } else {
                while (!s1.isEmpty()) {
                    TreeNode temp = s1.pop();
                    small.add(temp.val);

                    if (temp.right != null) {
                        s2.push(temp.right);
                    }
                    if (temp.left != null) {
                        s2.push(temp.left);
                    }
                }
            }

            l.add(small);
            leftToRight = !leftToRight;

            Stack<TreeNode> tempStack = s1;
            s1 = s2;
            s2 = tempStack;
        }

        return l;
    }
}