package array.binarySearch;

/**
 * 8. 变形：在旋转数组中搜索某个元素位置（无重复项）
 */
public class SearchInRotateArray {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 1, 2};
        System.out.println(searchInRotateArray(array, 2));
    }

    /**
     *
     * 注意：查找某个target的时候有==号，查找数组中的最小元素的时候没有==号
     */
    public static int searchInRotateArray(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (target == array[middle]) {
                return middle;
            } else {
                //如果 middle 属于 array 左边
                if (array[middle] > array[high]) {
                    //如果 target 属于 middle 左边
                    if (target < array[middle] && target >= array[low]) {
                        high = middle - 1;
                    } else {
                        low = middle + 1;
                    }
                } else {
                    if (target > array[middle] && target <= array[high]) {
                        low = middle + 1;
                    } else {
                        high = middle - 1;
                    }
                }
            }

        }
        return -1;
    }
}
