package sorting;

/**
 * 简单选择排序
 */
public class SelectionSort {
    public static void main(String[] args) {

    }

    public static void selectionSort(int[] array) {
        int min;

        for (int i = 1; i < array.length; i++) {
            min = i;
            // 从待排序序列中找到最小的元素
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            // 如果最小元素不是待排序序列的第一个元素，将其和第一个元素互换
            if (min != i) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;
            }
        }
    }

}
