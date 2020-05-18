/**
 * Created by Administrator on 2020/5/18.
 */
public class lowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B) {
        if(root == null) return null;
        if(root == A || root == B) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, A, B);
        TreeNode right = lowestCommonAncestor(root.right, A, B);

        if(left != null && right != null) return root;
        if(left != null ) return left;
        if(right != null) return right;
        return null;
    }
}
