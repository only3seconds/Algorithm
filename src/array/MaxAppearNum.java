package array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 寻找一个数组中出现次数最多的元素
 */
public class MaxAppearNum {
    public static void main(String[] args) {
        int[] array = {1};
        System.out.println(maxAppearNum2(array));

    }

    /**
     * 方法一：借用 HashMap,时间复杂度 O(n)，空间复杂度 O(n)
     * @param array
     * @return
     */
    public static int maxAppearNum1(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int target = array[0];
        int count = 1;

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
            if (map.get(array[i]) > count) {
                target = array[i];
            }
        }
        return target;
    }

    /**
     * 方法二: 先快速排序，然后遍历计数找到出现次数最多的元素
     * 时间复杂度 O(nlogn)
     * @param array
     * @return
     */
    public static int maxAppearNum2(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        Arrays.sort(array);
        int target = array[0];
        int count = 1; //count 用于记录重复的个数，每次记录新的数时置为1
        int max = 1; //max 用于记录历史上 count 的最大值

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i-1]) {
                count++;
                if (count > max) {
                    max = count;
                    target = array[i];
                }
            } else {
                count = 1;
            }
        }

        return target;
    }
}
