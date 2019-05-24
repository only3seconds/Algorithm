package tree;

import java.util.Arrays;

/**
 * 根据树的先序遍历和中序遍历重构二叉树
 */
public class ReConstructBinaryTree {

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {


        if (pre.length == 0 || in.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(pre[0]);

        int index = 0;
        while (index < in.length && in[index] != root.val) {
            index++;
        }


        root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, index + 1), Arrays.copyOfRange(in, 0, index));
        root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, index + 1, pre.length), Arrays.copyOfRange(in, index + 1, in.length));

        return root;


        //return reConstructBinaryTreeHandler(pre, 0, pre.length - 1, in, 0, in.length - 1);

    }

    public static TreeNode reConstructBinaryTreeHandler(int[] pre, int preLeft, int preRight, int[] in, int inLeft, int inRight) {

        //递归出口
        if (preLeft > preRight || inLeft > inRight) {
            return null;
        }

        TreeNode root = new TreeNode(pre[preLeft]);

        int index = 0;
        while (index < inRight && in[index] != root.val) {
            index++;
        }

        root.left = reConstructBinaryTreeHandler(pre, preLeft + 1, index - inLeft + preLeft, in, inLeft, index - 1);
        root.right = reConstructBinaryTreeHandler(pre, index - inLeft + preLeft + 1, preRight, in, index + 1, inRight);

        return root;


    }

    public static void main(String[] args) {
        int[] pre = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] in = {4, 7, 2, 1, 5, 3, 8, 6};

        System.out.println(reConstructBinaryTree(pre, in).val);
    }


}