package sortingAlgorithm;

import java.util.Arrays;

public class PopSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 9, 4, 6, 0, 1, 10};
        popSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void popSort(int[] array) {
        boolean flag;
        for(int i=0; i<array.length-1; i++) {
            flag = false;
            for(int j=0; j<array.length-i-1; j++) {
                if(array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag) break;
        }

    }
}
