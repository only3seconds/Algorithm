package application;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 拼多多笔试
 */
public class MinResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minResult = 0;

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i=0; i<n; i++) {
                a[i] = sc.nextInt();
            }
            for (int j=0; j<n; j++) {
                b[j] = sc.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            for (int i=0; i<n; i++) {
                minResult += a[i]*b[n-i];
            }
            System.out.println(minResult);
        }

    }
}
