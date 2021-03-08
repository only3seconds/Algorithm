//class Solution {
//
//    public int splitArray(int[] array, int m) {
//        int n = array.length;
//        int[] sum = new int[n];
//        int[][] dp = new int[m + 1][n];
//        sum[0] = array[0];
//        for (int i = 1; i < n; i++) {
//            sum[i] = sum[i - 1] + array[i];
//        }
//        for (int i = 0; i <= m; i++) {
//            for (int j = 0; j < n; j++) {
//                dp[i][j] = Integer.MAX_VALUE;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            dp[1][i] = sum[i];
//        }
//        for (int i = 2; i <= m; i++) {
//            for (int j = i - 1; j < n - (m - i); j++) {
//                for (int k = 0; k < j; k++) {
//                    dp[i][j] = Math.min(dp[i][j], Math.max(dp[i - 1][k], sum[j] - sum[k]));
//                }
//            }
//        }
//        return dp[m][n - 1];
//    }
//}
//
//class Solution {
//
//    //使用贪心算法，转换原题目的问题。二分法假定 mid是最大值，求m的数值
//    public boolean guess(long mid, int[] nums, int m) {
//        long sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            //当分隔的一边的和 大于最大值mid时， m --
//            if (sum + nums[i] > mid) {
//                m--;
//                sum = nums[i];
//                //当数值的某个元素本身的值已经大于mid，说明假定mid最大值是错的，直接返回false，开始下一轮循环
//                if (nums[i] > mid) {
//                    return false;
//                }
//            } else {
//                sum += nums[i];
//            }
//        }
//        return m >= 1;
//    }
//
//    public int splitArray(int[] nums, int m) {
//        long L = 0, R = 1; //为了使用左开右闭，所以把右边界初始化为1
//        long ans = 0;
//        //确定二分法的左右边界，这里我用 左开右闭 即[0, sum + 1) ,
//        for (int i = 0; i < nums.length; i++) {
//            R += nums[i];
//        }
//        //二分法的套路
//        //通过分析可以知道，当m越大，所求最大值会越小，即 m 与最大值呈现的是单调递减的关系
//        while (L < R) {
//            long mid = (L + R) / 2;
//            //判断为true时，由于是单调递减，需要把右边界左移
//            if (guess(mid, nums, m)) {
//                ans = mid;
//                R = mid;
//            } else {
//                L = mid + 1;
//            }
//        }
//        return (int) ans;
//    }
//}