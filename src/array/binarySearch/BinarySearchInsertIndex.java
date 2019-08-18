package array.binarySearch;

/**
 * 2. 变形：查找目标元素的插入位置
 *
 */
public class BinarySearchInsertIndex {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 3, 3, 4, 5};
        System.out.println(binarySearchInsertLocation(array, 0));
        System.out.println(binarySearchInsertLocation(array, 3.5));

    }

    public static int binarySearchInsertLocation(int[] array, double target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (target < array[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        return low;

    }
}
