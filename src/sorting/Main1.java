//package sorting;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Main1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String[] strs = sc.nextLine().toString().split(" ");
//        int n = Integer.valueOf(strs[0]);
//        int m = Integer.valueOf(strs[1]);
//
//        int s1 = 0;
//        int s2 = 0;
//        int s3 = 0;
//        int s4 = 0;
//        int s5 = 0;
//        int s6 = 0;
//        int[] max = new int[m];
//
//        for (int i = 0; i < n; i++) {
//            int[] col = new int[m];
//            String[] cols = sc.nextLine().toString().split(" ");
//            for (int j = 0; j < m; j++) {
//                col[j] = Integer.valueOf(cols[j]);
//            }
//
//            for (int k = 0; k < m; k++) {
//                if (col[k] != 0) {
//
//                    if (col[k] > max[k]) {
//                        s1 += col[k] * 2;
//                        max[k] = col[k];
//                    } else {
//                        s1 += (max[k] - col[k]) * 2;
//                    }
//                }
//
//            }
//        }
//        Random
//        System.out.println(s1+s2+s3);
//    }
//}
