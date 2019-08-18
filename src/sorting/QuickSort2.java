package sorting;

import java.util.Arrays;
import java.util.Random;

/**
 * 随机化快速排序
 */
public class QuickSort2 {
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
        Random temp = new Random();
        int pivot = left + Math.abs(temp.nextInt() % (right - left + 1)); // left 与 right 之间的随机整数
        swap(array, pivot, right); //随机化

        int key = array[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (array[j] <= key) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, right);
        return i + 1;
    }

    // 交换数组中两个数
    public static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}
