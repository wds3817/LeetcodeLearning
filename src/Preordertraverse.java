import java.util.Deque;
import java.util.LinkedList;
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
public class Preordertraverse {
    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(3);
        node.right.left.left = new TreeNode(4);

        Preordertraverse dm = new Preordertraverse();
        List<Integer> list;
        list = dm.preorderTraversal1(node);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public List<Integer> preorderTraversal1 (TreeNode root){
        List<Integer> result = new LinkedList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                result.add(node.val);
                stack.push(node.right);
                stack.push(node.left);
            }
        }
        return result;
    }
}

