package array.binarySearch;

import static array.binarySearch.BinarySearchInsertIndex.binarySearchInsertLocation;
import static array.binarySearch.BinarySearchLowerBound.binarySearchLowerBound;
import static array.binarySearch.BinarySearchUpperBound.binarySearchUpperBound;

/**
 * 5. 变形：【剑指Offer】数字在排序数组中出现的次数
 */
public class GetNumberOfK {
    public static void main(String[] args) {
        int[] array = {1, 3, 3, 5, 5, 5, 6, 7};
        System.out.println(getNumberOfK_method1(array, 5));
        System.out.println(getNumberOfK_method2(array, 5));

    }

    public static int getNumberOfK_method1(int[] array, int k) {
        int getFirstK = binarySearchLowerBound(array, k);
        int getLastK = binarySearchUpperBound(array, k);

        return getLastK - getFirstK + 1;
    }

    public static int getNumberOfK_method2(int[] array, int k) {
        int index1 = binarySearchInsertLocation(array, k - 0.5);
        int index2 = binarySearchInsertLocation(array, k + 0.5);

        return index2 - index1;
    }

}
