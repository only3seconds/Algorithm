package tree;

public class Diamete {
    public static int maxDiameter = 0;

    public static void main(String[] args) {

    }


    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        //int diameter = left + right;
        //maxDiameter = Math.max(diameter, maxDiameter);

        return Math.max(left, right) + 1;

    }

    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}




