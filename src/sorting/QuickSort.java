package sorting;

import java.util.Arrays;

/**
 * 快速排序 （选取第一个元素作为基准）:基于分治的思想，是冒泡排序的改进版
 * 平均时间复杂度：O(nlogn) 最好O(nlogn) 最坏O(n²)
 * 不稳定
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

    /**
     * partition 的时间复杂度为 O(n)
     * partition 每次确定一个元素的最终位置，并返回这个位置。比这个元素小的数都被派遣到元素左边，比这个元素大的数都被派遣到元素的右边。
     */

    public static int partition(int[] array, int left, int right) {
        int key = array[left];
        while (left < right) {
            while (left < right && array[right] >= key) {
                right--;
            }
            array[left] = array[right]; //会破坏稳定性
            while (left < right && array[left] <= key) {
                left++;
            }
            array[right] = array[left];
        }
        array[left] = key;

        return left;
    }
}
