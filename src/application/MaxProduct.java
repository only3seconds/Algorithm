package application;

import java.util.Scanner;

/**
 * 拼多多笔试
 */
public class MaxProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        for(int i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println(maxProduct(array));

    }

    public static long maxProduct(long[] A) {
        long firstMax = Integer.MIN_VALUE;
        long secondMax = Integer.MIN_VALUE;
        long thirdMax = Integer.MIN_VALUE;
        long firstMin = Integer.MAX_VALUE;
        long secondMin = Integer.MAX_VALUE;

        for(int i=0; i<A.length; i++) {
            if(A[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = A[i];

            } else if(A[i] > secondMax) {
                thirdMax = secondMax;
                secondMax = A[i];
            } else if(A[i] > thirdMax) {
                thirdMax = A[i];
            }

            if(A[i] < firstMin) {
                secondMin = firstMin;
                firstMin = A[i];
            } else if(A[i] < secondMin) {
                secondMin = A[i];
            }
        }

        return Math.max(firstMax*secondMax*thirdMax, firstMax*firstMin*secondMin);

    }
}
