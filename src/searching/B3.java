package searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> weightList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            int weight = input.nextInt();
            weightList.add(weight);
        }

        int result = 0;
        Collections.sort(weightList);
        for (int i = 0; i < n; i++) {
            int high = commonBinarySearch(weightList, i);
//      System.out.printf("beginIndex %d, high %d\n", i, high);
            result += high - i;
        }


//    for(int i=0;i<n;i++ ) {
//      for(int j=i+1;j<n;j++) {
//        if(valid(weightList.get(i), weightList.get(j))){
//          result ++;
//        }
//      }
//    }
        System.out.println(result);

    }

    private static boolean valid(long small, long big) {
        if (small > big) {
            long tmp = small;
            small = big;
            big = tmp;
        }
        return (double) small >= (big * 0.9);
    }

    public static int commonBinarySearch(List<Integer> weightList, int beginIndex) {
        int high = weightList.size() - 1;
        int middle = high;

        if (valid(weightList.get(beginIndex), weightList.get(high))) {
            return high;
        }
        int backtemp = weightList.get(beginIndex);
        int last = beginIndex;
        while (beginIndex < high) {
            middle = (beginIndex + high) / 2;
            if (!valid(backtemp, weightList.get(middle))) {
//        System.out.printf("beign %d, middle %d, high %d\n", beginIndex, middle, high);
                high = middle - 1;
            } else {
//        System.out.printf("beign %d, middle %d, high %d\n", beginIndex, middle, high);
                beginIndex = middle + 1;
                last = middle;
            }
        }

        return last;
    }
}