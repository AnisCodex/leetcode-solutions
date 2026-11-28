
class Solution {
    TreeNode dummy = new TreeNode(0);
    TreeNode curr = dummy;

    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return dummy.right;
    }

    private void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        // Visit left subtree
        inorder(root.left);

        // Make current node have no left child
        root.left = null;

        // Connect current node to previous node
        curr.right = root;
        curr = root;

        // Visit right subtree
        inorder(root.right);
    }
}
