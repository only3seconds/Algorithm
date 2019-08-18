package searching;

import java.util.Scanner;

public class B2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array;
        int[] dp;

        int i;
        int j;
        int p;
        int index;
        int len;
        for (i = 1; i <= n; i++) {
            len = 0;
            p = sc.nextInt();
            dp = new int[p + 1];
            array = new int[p + 1];
            for (j = 1; j <= p; j++) {
                array[j] = sc.nextInt();
            }
            dp[++len] = array[1];
            for (j = 2; j <= p; j++) {
                if (array[j] > dp[len]) {
                    dp[++len] = array[j];
                }
                index = search(dp, array[j], 1, len);
                dp[index] = array[j];
            }
            System.out.println(len);
        }
    }

    private static int search(int[] dp, int value, int start, int end) {
        int mid;
        while (start < end) {
            mid = (start + end) / 2;
            if (dp[mid] > value) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}