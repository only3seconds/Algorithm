package array.binarySearch;

/**
 * 9. 变形：在旋转数组中搜索某个元素位置（有重复项）
 */
public class SearchInRotateArray2 {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 1, 2, 3, 3};
        System.out.println(searchInRotateArray(array, 3));

    }

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
                } else if (array[middle] < array[high]) {
                    if (target > array[middle] && target <= array[high]) {
                        low = middle + 1;
                    } else {
                        high = middle - 1;
                    }
                } else {
                    high--;
                }
            }
        }
        return -1;
    }
}
