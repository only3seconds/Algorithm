package heap;

/**
 * 找到数组中第k大的数
 */
public class FindkMax {
    public static void main(String[] args) {
        int[] array = new int[] {7, 5, 15, 3, 17, 2, 20, 24, 1, 9, 12, 8};
        System.out.println(findK(array, 5));
    }

    public static int findK(int[] array, int k) {
        HeapOperator.buildHeap(array, k);

        for (int i = k; i < array.length; i++) {
            if (array[i] > array[0]) {
                array[0] = array[i];
                HeapOperator.downAdjust(array, 0, k);
            }
        }
        return array[0];
    }

}
