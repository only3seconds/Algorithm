package tree.traversal;

import tree.TreeNode;

import java.util.Stack;

/**
 * 二叉树的深度优先遍历 （先序、中序、后序）- 非递归实现
 * 用栈来保存先前走过的路径，以便可以在访问完子树后,可以利用栈中的信息,回退到当前节点的双亲节点,进行下一步操作。
 */
public class DepthTraversal {
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

        System.out.println("先序遍历：");
        preOrder(tree[0]);
        System.out.println("\n" + "中序遍历： ");
        midOrder(tree[0]);
        System.out.println("\n" + "后序遍历： ");
        postOrder(tree[0]);

        System.out.println("\n" + "先序遍历2：");
        preOrder(null);
        System.out.println("\n" + "中序遍历2： ");
        midOrder(null);
        System.out.println("\n" + "后序遍历2： ");
        postOrder(null);

    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root; //遍历结点
        //node为null，并且栈为空时，则遍历结束
        while (node != null || !stack.empty()) {
            while (node != null) {
                System.out.print(node.getVal() + " ");//先访问根
                stack.push(node);
                node = node.getLeft();
            }
            if (!stack.empty()) {
                node = stack.pop();
                node = node.getRight();
            }
        }

    }

    public static void midOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;

        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.getLeft();
            }
            if (!stack.isEmpty()) {
                node = stack.pop();
                System.out.print(node.getVal() + " ");//先访问左孩子，再访问根
                node = node.getRight(); //最后访问右孩子
            }
        }


    }

    public static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        int left = 1; //在辅助栈里表示左结点
        int right = 2;//在辅助栈里表示右结点
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> stack2 = new Stack<>(); //辅助栈，用于表示子结点返回父结点时是左孩子还是右孩子
        TreeNode node = root;

        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                stack2.push(left);
                node = node.getLeft();
            }

            //如果是从右子结点返回父结点，则任务完成，将两个栈的结点弹出
            while (!stack.isEmpty() && stack2.peek() == right) {
                stack2.pop();
                System.out.print(stack.pop().getVal() + " ");
            }

            //如果是从左子结点返回父结点，则将标记改为右子结点
            if (!stack.isEmpty() && stack2.peek() == left) {
                stack2.pop();
                stack2.push(right);
                node = stack.peek().getRight();
            }

        }
    }

}