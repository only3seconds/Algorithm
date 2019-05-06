package test;

import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];

        if (A == null || A.length == 0) {
            return B;
        }
        int[] pre = new int[A.length];
        int[] post = new int[A.length];

        pre[0] = 1;
        for (int i = 1; i < A.length; i++) {
            pre[i] = pre[i-1] * A[i-1];
        }

        post[post.length-1] = A[A.length-1];
        for (int i = A.length-1; i >= 0; i--) {
            post[i-1] = post[i] * A[i-1];
        }

        for (int i = 0; i < B.length; i++) {
            B[i] = pre[i] * post[i];
        }
        return B;
    }
}