import java.util.List;

/**
 * Created by Administrator on 2020/4/24.
 * Construct tree from inorder and postorder
 */
public class ConstructTree {

    int pInorder;   // index of inorder array
    int pPostorder; // index of postorder array
    public static void main(String[] args) {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        ConstructTree t = new ConstructTree();
        t.buildTree(inorder, postorder);
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        pInorder = inorder.length - 1;
        pPostorder = postorder.length - 1;
        return buildTree(inorder, postorder, null);
    }
    private TreeNode buildTree(int[] inorder, int[] postorder, TreeNode end) {
        if (pPostorder < 0) {
            return null;
        }
        // create root node
        TreeNode n = new TreeNode(postorder[pPostorder--]);
        // if right node exist, create right subtree
        if (inorder[pInorder] != n.val) {
            n.right = buildTree(inorder, postorder, n);
        }
        pInorder--;
        // if left node exist, create left subtree
        if ((end == null) || (inorder[pInorder] != end.val))    {
            n.left = buildTree(inorder, postorder, end);
        }

        return n;
    }
}
