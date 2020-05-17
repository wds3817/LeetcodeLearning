import java.util.ArrayList;

/**
 * Created by Administrator on 2020/5/17.
 */
public class preorderTraverseDivideandConquer {
    public ArrayList<Integer> preorderTraverse(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        // null or leaf
        if (root == null) {
            return result;
        }
        // divide
        ArrayList<Integer> left = preorderTraverse(root.left);
        ArrayList<Integer> right = preorderTraverse(root.right);
        //conquer
        result.add(root.val);
        result.addAll(left);
        result.addAll(right);
        return result;


    }
}
