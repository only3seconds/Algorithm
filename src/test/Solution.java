package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }
        Queue<TreeNode> nodes = new LinkedList<>();

        nodes.offer(root);
        while (!nodes.isEmpty()) {
            TreeNode target = nodes.poll();
            result.add(target.val);

            //向队列中添加 target 的左孩子
            if (target.left != null) {
                nodes.offer(target.left);
            }
            //向队列中添加 target 的右孩子
            if (target.right != null) {
                nodes.offer(target.right);
            }
        }
        return result;
    }

}