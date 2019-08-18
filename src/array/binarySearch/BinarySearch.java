package array.binarySearch;

/**
 * 1. 基本二分查找: 查找有序数组中某个元素的位置，找不到返回-1或者待插入的位置
 *
 * 时间复杂度：平均O(logn),最坏O(logn)，最好O(1)
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 6, 8, 10};
        System.out.println(binarySearch(data, 11));
        System.out.println(binarySearch(data, 0, data.length - 1, 3));

    }

    /**
     * 非递归实现
     *
     * @param array
     * @param target
     * @return
     */
    public static int binarySearch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (target < array[middle]) {
                high = middle - 1;
            } else if (target > array[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        // 返回待插入的位置
        // return low;
        return -1;
    }

    /**
     * 递归实现
     *
     * @param array
     * @param low
     * @param high
     * @param target
     * @return
     */
    public static int binarySearch(int[] array, int low, int high, int target) {
        if (low <= high) {
            int middle = low + (high - low) / 2;
            if (target < array[middle]) {
                return binarySearch(array, low, middle - 1, target);
            } else if (target > array[middle]) {
                return binarySearch(array, middle + 1, high, target);
            } else {
                return middle;
            }
        } else {
            return -1;
        }
    }
}
