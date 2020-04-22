import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2020/4/22.
 */
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        this.val = x;
    }
    //TreeNode root;
}
public class inorderTraverse {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.right = new TreeNode(6);
        node.right.left = new TreeNode(5);
        node.right.left.left = new TreeNode(4);

        inorderTraverse dm = new inorderTraverse();
        List<Integer> list;
        list = dm.inorderTraversal(node);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        //if (root == null)   return null;
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }
    public void helper(TreeNode root, List<Integer> list) {
        if (root == null) return;
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }
}
