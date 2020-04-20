/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        this.val = x;
    }
    TreeNode root;
}
class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return checkValidBST(root, null, null);
    }
    boolean checkValidBST(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        if ((min != null && min >= root.val) || (max != null && max <= root.val)) {
            return false;
        }
        return checkValidBST(root.left, min, root.val) && checkValidBST(root.right, root.val, max);
    }
}