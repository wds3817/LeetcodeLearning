/**
 * Created by Administrator on 2020/4/20.
 */
public class ValidateBST {
    public boolean validateBST(TreeNode root) {
        return Validate(root, null, null);
    }
    boolean Validate(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        if ((min != null && min > root.val)||(max != null && max < root.val)) {
            return false;
        }
        return Validate(root.left, min, root.val)&&Validate(root.right, root.val, max);
    }
}
