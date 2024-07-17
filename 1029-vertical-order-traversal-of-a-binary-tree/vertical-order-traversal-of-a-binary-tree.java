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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        TreeMap<Integer, List<Pair>> map = new TreeMap<>();

        if (root == null) {
            return ans;
        }
        helper(root, 0, map, 0);

        for (int k : map.keySet()) {
            List<Pair> l = map.get(k);
            l.sort((a, b) -> a.level == b.level ? a.val - b.val : a.level - b.level);
            List<Integer> small = new ArrayList<>();
            for (Pair p : l) {
                small.add(p.val);
            }
            ans.add(small);
        }
        return ans;
    }

    public static void helper(TreeNode node, int hd, TreeMap<Integer, List<Pair>> map, int level) {
        if (node == null) {
            return;
        }

        if (!map.containsKey(hd)) {
            map.put(hd, new ArrayList<>());
        }
        map.get(hd).add(new Pair(level, node.val));

        helper(node.left, hd - 1, map, level + 1);
        helper(node.right, hd + 1, map, level + 1);
    }

    static class Pair {
        int level;
        int val;

        Pair(int level, int val) {
            this.level = level;
            this.val = val;
        }
    }
}