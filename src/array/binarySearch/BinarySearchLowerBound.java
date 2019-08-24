package array.binarySearch;

/**
 * 3. 变形：查找目标元素第一次出现的位置
 */
public class BinarySearchLowerBound {
    public static void main(String[] args) {
        int[] array = {1, 3, 3, 5, 7, 7, 7, 8, 14, 14, 15};
        System.out.println(binarySearchLowerBound(array, 15));

    }

    public static int binarySearchLowerBound(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (target <= array[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        //退出循环时，low>high，low 刚好指向target第一次出现的位置
        if (low < array.length && target == array[low]) {
            return low;
        } else {
            return -1;
        }
    }
}
