package test;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,0};
        System.out.println(InversePairs(array));
    }
    public static int InversePairs(int [] array) {
        if(array == null || array.length <= 1) {
            return 0;
        }
        ArrayList<Integer> growList = new ArrayList<>();
        int result = 0;
        growList.add(array[0]);

        for(int i = 1; i < array.length; i++) {
            int index = 0;
            while (index < growList.size() && growList.get(index) <= array[i]) {
                index++;
            }
            result += growList.size()-index;
            growList.add(array[i]);
            Collections.sort(growList);
        }
        return result;
    }
}