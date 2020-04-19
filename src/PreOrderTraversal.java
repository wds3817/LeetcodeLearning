import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2020/4/17.
 * This is for the preorderTravesal by using the recursion method
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

public class PreOrderTraversal {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(3);
        node.right.left.left = new TreeNode(4);

        PreOrderTraversal dm = new PreOrderTraversal();
        List<Integer> list;
        list = dm.Preordertraversal(node);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
    }
    public List<Integer> Preordertraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preordertraverse(root, res);
        return res;
    }
    public void preordertraverse(TreeNode root, List<Integer> res) {
        if (root == null) return;
        res.add(root.val);
        preordertraverse(root.left, res);
        preordertraverse(root.right, res);
    }

}
