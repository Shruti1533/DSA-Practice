/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> preorder = new ArrayList<>();
        helperSerialize(root, preorder);
        return String.join(",", preorder);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) {
            return null;
        }

        Queue<String> nodes = new LinkedList<>(Arrays.asList(data.split(",")));
        return helperDeserialize(nodes,Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private void helperSerialize(TreeNode root, List<String> preorder) {
        if (root == null) {
            return;
        }
        preorder.add(String.valueOf(root.val));
        helperSerialize(root.left, preorder);
        helperSerialize(root.right, preorder);
    }

    private TreeNode helperDeserialize(Queue<String> nodes, int lower, int upper) {
        if (nodes.isEmpty())
            return null;

        int val = Integer.parseInt(nodes.peek());
        if (val < lower || val > upper)
            return null;

        nodes.remove();
        TreeNode root = new TreeNode(val);
        root.left = helperDeserialize(nodes, lower, val);
        root.right = helperDeserialize(nodes, val, upper);

        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// String tree = ser.serialize(root);
// TreeNode ans = deser.deserialize(tree);
// return ans;