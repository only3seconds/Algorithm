package array.binarySearch;

/**
 * 6. 变形：查找旋转数组的最小元素（假设不存在重复数字）
 */
public class MinNumberInRotateArray {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 1, 2};
        System.out.println(minNumberInRotateArray(array));

    }

    public static int minNumberInRotateArray(int[] array) {
        int low = 0;
        int high = array.length - 1;

        //⚠️没有等号
        while (low < high) {
            int middle = low + (high - low) / 2;
            if (array[middle] > array[high]) {
                // 此时 middle 属于左半部，最小数一定在 middle 右边（旋转数组的特点：左半部分>右半部分），所以low向右边逼近
                low = middle + 1;
            } else {
                high = middle;
            }
        }

        //退出循环时， low == high
        return array[low];
    }
}
