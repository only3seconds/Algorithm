package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            map1.put(i, 1);
//        }

        for (int i = 0; i < m; i++) {
            int laji1 = sc.nextInt();
            int laji2 = sc.nextInt();

            if (map1.containsKey(laji1)) {
                map2.put(laji1, 1);
                map1.put(laji2, 1);
            } else {
                map1.put(laji1, 1);
                map2.put(laji2, 1);
            }

        }

        int max = Math.max(map1.size(), map2.size());
        if (max <= n / 2) {
            System.out.println(max * 2);
        } else {
            System.out.println(n / 2 * 2);
        }
    }
}
