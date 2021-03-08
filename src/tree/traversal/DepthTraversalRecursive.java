package tree.traversal;

import tree.TreeNode;

/**
 * 二叉树的深度优先遍历 （先序、中序、后序）- 递归实现
 */
public class DepthTraversalRecursive {
    public static void main(String[] args) {
        //以数组形式生成一棵完全二叉树
        TreeNode[] tree = new TreeNode[10];
        for (int i = 0; i < 10; i++) {
            tree[i] = new TreeNode(i);
        }
        for (int i = 0; i < 10; i++) {
            if (i * 2 + 1 < 10) {
                tree[i].setLeft(tree[i * 2 + 1]);
            }
            if (i * 2 + 2 < 10) {
                tree[i].setRight(tree[i * 2 + 2]);
            }
        }

        System.out.println("先序遍历：");
        preOrderRecursive(tree[0]);
        System.out.println("\n" + "中序遍历： ");
        midOrderRecursive(tree[0]);
        System.out.println("\n" + "后序遍历： ");
        postOrderRecursive(tree[0]);

        System.out.println("\n" + "先序遍历2：");
        preOrderRecursive(null);
        System.out.println("\n" + "中序遍历2： ");
        midOrderRecursive(null);
        System.out.println("\n" + "后序遍历2： ");
        postOrderRecursive(null);

    }

    /**
     * 先序遍历
     *
     * @param root
     */
    public static void preOrderRecursive(TreeNode root) {
        //递归出口
        if (root == null) {
            return;
        }

        System.out.print(root.getVal() + " ");
        preOrderRecursive(root.getLeft());
        preOrderRecursive(root.getRight());


    }

    /**
     * 中序遍历
     *
     * @param root
     */
    public static void midOrderRecursive(TreeNode root) {
        //递归出口
        if (root == null) {
            return;
        }

        midOrderRecursive(root.getLeft());
        System.out.print(root.getVal() + " ");
        midOrderRecursive(root.getRight());

    }

    /**
     * 后序遍历
     *
     * @param root
     */
    public static void postOrderRecursive(TreeNode root) {
        if (root == null) {
            return;
        }

        postOrderRecursive(root.getLeft());
        postOrderRecursive(root.getRight());
        System.out.print(root.getVal() + " ");
    }
}

