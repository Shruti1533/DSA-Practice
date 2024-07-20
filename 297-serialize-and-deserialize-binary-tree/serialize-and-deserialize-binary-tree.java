/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
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
        if(data.isEmpty()){
            return null;
        }

        Queue <String> nodes=new LinkedList<>(Arrays.asList(data.split(",")));
        return helperDeserialize(nodes);
    }

    private void helperSerialize(TreeNode root, List<String> preorder) {
        if (root == null) {
            preorder.add("null");
            return;
        }
        preorder.add(String.valueOf(root.val));
        helperSerialize(root.left, preorder);
        helperSerialize(root.right, preorder);
    }

    private TreeNode helperDeserialize(Queue <String> nodes){
        String val=nodes.remove();
        if (val.equals("null")) return null;

        TreeNode temp=new TreeNode(Integer.parseInt(val));
        temp.left=helperDeserialize(nodes);
        temp.right=helperDeserialize(nodes);

        return temp;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));