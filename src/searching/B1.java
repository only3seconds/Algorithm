//package searching;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class B1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.valueOf(sc.nextLine());
//        long [] array = new long [n];
//        int i = 0;
//        while (sc.hasNext()) {
//            array[i++] = Integer.valueOf(sc.nextLine());
//        }
//
//        System.out.println(longincreaseSonList(array));
//
//    }
//
//    public static int longincreaseSonList(long[] array) {
//        if (array == null || array.length <= 0) {
//            return 0;
//        }
//        int len = array.length;
//        if (len == 1) {
//            return 1;
//        }
//
//        int resMax = 1;
//
//        int[] dp = new int[len];
//        Arrays.fill(dp, 1);
//
//        for (int i = len - 1; i >= 0; i--) {
//
//            if (i == len - 1) {
//                dp[i] = 1;
//                continue;
//            }
//            for (int j = i + 1; j < len; j++) {
//                if (array[i] < array[j]) {
//                    dp[i] = Math.max(dp[i], 1 + dp[j]);
//                }
//            }
//            resMax = Math.max(resMax, dp[i]);
//        }
//
//        return resMax;
//    }
//
//}
//
//
//}
