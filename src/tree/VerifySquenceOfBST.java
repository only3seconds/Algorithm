package tree;

/**
 * 判断一个数组是否为某个二叉搜索树的后序遍历
 */
public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }

        return verifySquenceOfBST(sequence, 0, sequence.length-1);

    }

    public boolean verifySquenceOfBST(int [] sequence, int left, int right) {
        //递归出口
        if (right < left) {
            return true;
        }

        //找到第一个大于根节点的数
        int index = 0;
        for (; index < right; index++) {
            if (sequence[index] > sequence[right]) {
                break;
            }
        }

        //判断index后面的数是否都大于根节点
        for (int i = index; i < right; i++) {
            if (sequence[i] < sequence[right]) {
                return false;
            }
        }

        return verifySquenceOfBST(sequence, left, index-1) && verifySquenceOfBST(sequence, index, right);
    }
}