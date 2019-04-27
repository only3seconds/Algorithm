package sorting;

import java.util.Arrays;

/**
 * 归并排序：基于分治的思想
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 6, 8, 7, 5};
        System.out.println(Arrays.toString(array));
        mergeSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle+1, right);
            merge(array,left, middle, right);
        }
    }

    //合并两个有序子序列
    public static void merge(int[] array, int left, int middle, int right) {
        int[] temp = new int[array.length]; //辅助数组
        int i = left; //遍历左子序列
        int j = middle + 1; //遍历右子序列
        int k = left; //遍历辅助数组

        while (i <= middle && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }

        while (i <= middle) {
            temp[k++] = array[i++];
        }

        while (j <= right) {
            temp[k++] = array[j++];
        }

        for (int m = left; m <= right; m++) {
            array[m] = temp[m];
        }
    }
}
