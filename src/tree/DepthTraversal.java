package tree;

import java.util.Stack;

/**
 * 二叉树的深度优先遍历
 */
public class DepthTraversal {

    public static void depthTraversalOfBinaryTree(TreeNode root) {
        if (root == null) {
            System.out.println("Tree is empty!");
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode target;
        while (!stack.isEmpty()) {
            target = stack.pop();
            System.out.println(target.val);

            if (target.right != null) {
                stack.push(target.right);
            }

            if (target.left != null) {
                stack.push(target.left);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
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

        depthTraversalOfBinaryTree(root);
    }
}
