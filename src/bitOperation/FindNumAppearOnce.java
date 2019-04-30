package bitOperation;

/**
 * 找出数组中只出现一次的数字，其他数字均出现两次
 */
public class FindNumAppearOnce {
    public static void main(String[] args) {
        int[] array = {1, 1, 3, 4, 5, 0, 0, 5, 4};
        System.out.println(FindNumsAppearOnce(array));
    }
    public static int FindNumsAppearOnce(int[] array) {
        int xorRes = 0;
        for (int i = 0; i < array.length; i++) {
            xorRes ^= array[i];
        }
        return xorRes;
    }
}