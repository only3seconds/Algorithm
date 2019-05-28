package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


/**
 * 寻找二叉树中结点值的和为某一值的所有路径。
 */
public class FindPath {
    private static ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    private static ArrayList<Integer> path = new ArrayList<>();

    public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null || target < root.val) {
            return result;
        }

        path.add(root.val);
        target -= root.val;

        //如果当前结点为叶子结点，并且满足路径和为target
        if (target == 0 && root.left == null && root.right == null) {
            result.add(new ArrayList<Integer>(path));
        }

        if (root.left != null) {
            FindPath(root.left, target);
        }
        if (root.right != null) {
            FindPath(root.right, target);
        }

        //path回退一步,寻找另一条路径
        path.remove(path.size() - 1);

        //Comparator，先确定比较单位是什么，然后升序，o1在前，降序，o2在前
        Collections.sort(result, new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o2.size() - o1.size();
            }
        });

        return result;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(12);
        TreeNode node3 = new TreeNode(4);
        TreeNode node4 = new TreeNode(7);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;

        System.out.println(FindPath(root, 22));
    }
}