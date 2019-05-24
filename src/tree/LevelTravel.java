package tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树的层次遍历
 */
public class LevelTravel {
    public static void leveTravelOfBinaryTree(TreeNode root) {
        if (root == null) {
            System.out.println("Tree is null!");
        }
        Queue<TreeNode> nodes = new LinkedList<>();

        nodes.offer(root);
        while (!nodes.isEmpty()) {
            TreeNode target = nodes.poll();
            System.out.println(target.val);

            //向队列中添加 target 的左孩子
            if (target.left != null) {
                nodes.offer(target.left);
            }
            //向队列中添加 target 的右孩子
            if (target.right != null) {
                nodes.offer(target.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = null;
        TreeNode node1 = new TreeNode(6);
        TreeNode node2 = new TreeNode(10);
        TreeNode node3 = new TreeNode(5);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(9);
        TreeNode node6 = new TreeNode(11);

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;

        leveTravelOfBinaryTree(root);

    }
}
