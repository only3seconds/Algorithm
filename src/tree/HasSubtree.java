package tree;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构.
 */
public class HasSubtree {

    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }

        boolean flag = false;
        if (root1.val == root2.val) {
            flag = matchSubTree(root1, root2);
        }
        //候选结点匹配失败，则在左子树中寻找候选结点并进行匹配
        if (!flag) {
            flag = HasSubtree(root1.left, root2);
        }

        //左子树中没有找到候选结点或者候选结点匹配失败，则在右子树中寻找候选结点并进行匹配
        if (!flag) {
            flag = HasSubtree(root1.right, root2);
        }

        return flag;
    }

    //对候选结点进行匹配
    public boolean matchSubTree(TreeNode root1, TreeNode root2) {
        //递归出口一：root2中的结点全部匹配成功
        if (root2 == null) {
            return true;
        }
        //递归出口二：root2 还没遍历完，root1已经遍历完了
        if (root1 == null) {
            return false;
        }
        //递归出口三：匹配过程中，某个结点匹配不成功
        if (root1.val != root2.val) {
            return false;
        }

        //递归匹配左子树和右子树
        return matchSubTree(root1.left, root2.left) && matchSubTree(root1.right, root2.right);
    }
}