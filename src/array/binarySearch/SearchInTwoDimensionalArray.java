package array.binarySearch;

/**
 * 10. 变形：【剑指Offer：二维数组中的查找】
 * 问题描述：在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class SearchInTwoDimensionalArray {
    public static void main(String[] args) {
        int[][] array = {{1,2,3,4}, {2,3,4,5}, {3,4,5,6}, {4,5,6,7}};
        System.out.println(find(array, 8));

    }

    public static boolean find(int[][] array, int target) {
        int row = array.length;
        int col = array[0].length;
        int i = 0;
        int j = col - 1;

        while (i < row && j >= 0) {
            if (target < array[i][j]) {
                j--;
            } else if (target > array[i][j]) {
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

}
