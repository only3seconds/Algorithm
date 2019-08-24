package array.binarySearch;

/**
 * 7. 变形：查找旋转数组的最小元素（存在重复项）
 *  【剑指Offer：旋转数组的最小数字】
 */
public class MinNumberInRotateArray2 {
    public static void main(String[] args) {
        int[] array1 = {1, 0, 1, 1, 1};
        int[] array2 = {1, 1, 1, 0, 1};
        System.out.println(minNumberInRotateArray(array1));
        System.out.println(minNumberInRotateArray(array2));
    }

    public static int  minNumberInRotateArray(int[] array) {
        int low = 0;
        int high = array.length - 1;

        while (low < high) {
            int middle = low + (high - low) / 2;
            if (array[middle] > array[high]) {
                low = middle + 1;
            } else if (array[middle] < array[high]) {
                high = middle;
            } else {
                //array[middle] == array[high] 时，无法判断最小值在左边还是右边，只能慢慢缩小范围
                high--;
            }
        }

        return array[low];
    }
}
