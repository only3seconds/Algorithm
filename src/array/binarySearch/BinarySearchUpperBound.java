package array.binarySearch;

/**
 * 4. 变形：查找目标元素最后一次出现的位置
 */
public class BinarySearchUpperBound {

    public static void main(String[] args) {
        int[] array = {1, 3, 3, 5, 7, 7, 7, 8, 14, 14, 15};
        System.out.println(binarySearchUpperBound(array, 7));

    }

    public static int binarySearchUpperBound(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;
            if (target >= array[middle]) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        //退出循环时，low>high，high 刚好指向target最后一次出现的位置
        if (high >= 0 && target == array[high]) {
            return high;
        } else {
            return -1;
        }
    }
}

