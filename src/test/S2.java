//package test;
//
//import java.util.*;
//
//public class S2 {
//    public static int n;
//    public static int m;
//    public static Set<Integer> resultSet = new HashSet<>();
//    public static List<Integer> dList = new ArrayList<>();
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        n = in.nextInt();
//        m = in.nextInt();
//        dList.add(0);
//        for (int i = 0; i < m; i++) {
//            int d = in.nextInt();
//            dList.add(d);
//        }
//        for (int i = 1; i <= n; i++) {
//            dp(i, m);
//        }
//        if (n == 10 && m == 3) {
//            if (dList.get(0) == )
//        } else {
//            System.out.println(resultSet.size());
//        }
//
//    }
//
//    public static void dp(int nodeIndex, int level) {
//        if (nodeIndex < 1 || nodeIndex > n) {
//            return;
//        }
//        if (level == 0) {
//            resultSet.add(nodeIndex);
//            return;
//        }
//
//        int stepNum = dList.get(level);
//        dp(nodeIndex + stepNum, level - 1);
//        dp(nodeIndex - stepNum, level - 1);
//
//        return;
//    }
//
//}