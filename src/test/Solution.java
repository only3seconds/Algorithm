package test;

public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {

        //flag数组用于标记该位置是否被访问过
        boolean[] visited = new boolean[matrix.length];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (judge(matrix, rows, cols, i, j, visited, str, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * @param matrix 原始数组，以一维数组的形式给出
     * @param rows 二维数组的行数
     * @param cols 二维数组的列数
     * @param i 二维数组的行指针
     * @param j 二维数组的列指针
     * @param flag 对应的标记数组
     * @param str 目标字符数组
     * @param k 访问字符数组的指针
     * @return
     */
    private boolean judge(char[] matrix, int rows, int cols, int i, int j, boolean[] visited, char[] str, int k) {
        int index = i * cols + j;
        //递归终止条件
        if (i < 0 || j < 0 || i >= rows || j >= cols || matrix[index] != str[k] || visited[index] == true)
            return false;
        //若k已经到达str末尾了，说明之前的都已经匹配成功了，直接返回true即可
        if (k == str.length - 1)
            return true;
        //位置置为true
        visited[index] = true;

        //回溯，递归寻找，每次找到了就给k加一，找不到，还原
        if (judge(matrix, rows, cols, i - 1, j, visited, str, k + 1) ||
                judge(matrix, rows, cols, i + 1, j, visited, str, k + 1) ||
                judge(matrix, rows, cols, i, j - 1, visited, str, k + 1) ||
                judge(matrix, rows, cols, i, j + 1, visited, str, k + 1)) {
            return true;
        }
        //走到这，说明这一条路不通，还原，再试其他的路径
        visited[index] = false;
        return false;
    }


}