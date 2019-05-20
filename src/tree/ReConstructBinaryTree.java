package test;

public class Solution {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        return reConstructBinaryTreeHandler(pre, 0, pre.length - 1, in, 0, in.length - 1);


    }

    public static TreeNode reConstructBinaryTreeHandler(int[] pre, int preLeft, int preRight, int[] in, int inLeft, int inRight) {

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