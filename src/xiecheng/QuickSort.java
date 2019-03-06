package xiecheng;

import java.util.Arrays;

/**
 * 快速排序 （选取第一个元素作为基准）
 * 时间复杂度：O(nlogn)
 *
 */

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {0, 9, 8, 4, 5, 6, 2, 3, 4};
        System.out.println("排序前： " + Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println("排序后： " + Arrays.toString(array));
    }

    public static void quickSort(int[] array, int left, int right) {
        int pivot;
        if (left < right) {
            pivot = partition(array, left, right);
            quickSort(array, left, pivot - 1);
            quickSort(array, pivot + 1, right);
        }
    }

    public static int partition(int[] array, int left, int right) {
        int key = array[left];
        while (left < right) {
            while (left < right && array[right] >= key) {
                right--;
            }
            array[left] = array[right];
            while (left < right && array[left] <= key) {
                left++;
            }
            array[right] = array[left];
        }
        array[left] = key;
        return left;

    }
}
