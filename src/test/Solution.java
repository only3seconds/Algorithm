package test;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 2, 5, 2, 3};
        System.out.println(MoreThanHalfNum_Solution(array));
    }

    public static int MoreThanHalfNum_Solution(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int target = 0;

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
            if (map.get(array[i]) > array.length / 2) {
                target = array[i];
            }
        }
        return target;
    }
}