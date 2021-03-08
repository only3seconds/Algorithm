package tree.traversal;

import tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树的层次遍历,也叫广度优先遍历
 */
public class LevelTraversal {
    public static void main(String[] args) {
        //以数组形式生成一棵完全二叉树
        TreeNode[] tree = new TreeNode[10];
        for (int i = 0; i < 10; i++) {
            tree[i] = new TreeNode(i);
        }
        for (int i = 0; i < 10; i++) {
            if ((i * 2 + 1) < 10) {
                tree[i].setLeft(tree[i * 2 + 1]);
            }
            if ((i * 2 + 2) < 10) {
                tree[i].setRight(tree[i * 2 + 2]);
            }
        }

        System.out.println("层次遍历：");
        levelTravelOfBinaryTree(tree[0]);
        System.out.println("\n" + "层次遍历2： ");
        levelTravelOfBinaryTree(null);

    }

    public static void levelTravelOfBinaryTree(TreeNode root) {
        if (root == null) {
            return;
        }

        Queue<TreeNode> list = new LinkedList<>();

        list.offer(root);
        while (!list.isEmpty()) {
            TreeNode target = list.poll();
            System.out.print(target.getVal() + " ");

            //向队列中添加 target 的左孩子
            if (target.getLeft() != null) {
                list.offer(target.getLeft());
            }
            //向队列中添加 target 的右孩子
            if (target.getRight() != null) {
                list.offer(target.getRight());
            }
        }
    }


}
