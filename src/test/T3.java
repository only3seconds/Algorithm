package test;

import java.util.HashSet;
import java.util.Scanner;

public class T3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] array = new long[n + 1];
        long[] persons = new long[n + 1];

        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            array[i] = sc.nextLong();
            if(array[i] == 0L) {
                set.add(i);
            }
        }
        set.add(0);
        persons[0] = m;
        int time = 0;

        int begin=0;
        int end =0;
        while ((set.size() - 1) < n) {
            time++;

            for (int i = end; i >= begin; i--) {
                if (persons[i] != 0) {
                    if (persons[i] > array[i] && i != n) {
                        persons[i + 1] += persons[i] - array[i];
                        persons[i] = array[i];
                        array[i] = 0;
                        set.add(i);
                    } else {
                        if (i == n && persons[i] >= array[i]) {
                            array[i] = 0;
                            set.add(i);
                        } else {
                            array[i] -= persons[i];
                            if (array[i] == 0) {
                                set.add(i);
                            }
                        }
                    }
                }
            }
            if(end + 1<=n && persons[end+1]!=0) {
                end = end+1;
            }
            if(begin+1<=n && persons[begin] == 0 ) {
                begin = begin+1;
            }
        }
        System.out.println(time);
    }
}
