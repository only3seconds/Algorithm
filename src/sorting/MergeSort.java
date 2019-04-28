package sorting;

import java.util.Arrays;

/**
 * 归并排序（二路归并）：基于分治的思想
 * 时间复杂度：任何情况下都是 O(nlogn)
 * 稳定性：稳定
 */
public class MergeSort {
    public static int[] temp; //辅助数组

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 6, 8, 7, 5};
        System.out.println(Arrays.toString(array));
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            temp = new int[array.length];
            int middle = (left + right) / 2;

            mergeSort(array, left, middle); //对左半边进行归并排序
            mergeSort(array, middle + 1, right); //对右半边进行归并排序
            merge(array, left, middle, right); //合并左右
        }
    }

    //合并两个有序子序列
    public static void merge(int[] array, int left, int middle, int right) {
        int i = left; //遍历左子序列
        int j = middle + 1; //遍历右子序列
        int k = left; //遍历辅助数组

        while (i <= middle && j <= right) {
            if (array[i] <= array[j]) { //==放在这保证归并排序的稳定性
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i <= middle) temp[k++] = array[i++];
        while (j <= right) temp[k++] = array[j++];


        for (int index = left; index <= right; index++) {
            array[index] = temp[index];
        }
    }
}
