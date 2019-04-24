package searching;

/**
 * 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 6, 8, 34};
        System.out.println(binarySearch(data, 4));

    }

    public static int binarySearch(int [] array, int target) {
        int low = 0;
        int high = array.length-1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (target < array[middle]) {
                high = middle - 1;
            } else if (target > array[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
