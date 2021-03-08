//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n = sc.nextInt();
//            int nums[] = new int[n];
//            for (int j = 0; j < n; j++) {
//                nums[j] = sc.nextInt();
//            }
//            calSubArrayMinValue(nums);
//        }
//    }
//
//
//    public static void calSubArrayMinValue(int[] nums) {
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//        }
//
//        int dp[][] = new int[nums.length + 1][sum / 2 + 1];
//        for (int i = 0; i < nums.length; i++) {
//            for (int cp = 1; cp <= sum / 2; cp++) {
//                dp[i + 1][cp] = dp[i][cp];
//                if (nums[i] <= cp && dp[i][cp - nums[i]] + nums[i] > dp[i][cp]) {
//                    dp[i + 1][cp] = dp[i][cp - nums[i]] + nums[i];
//                }
//            }
//        }
//
//
//        int min = Math.min(dp[nums.length][sum / 2], sum - dp[nums.length][sum / 2]);
//        int max = Math.max(dp[nums.length][sum / 2], sum - dp[nums.length][sum / 2]);
//        System.out.printf("%d %d\n", min, max);
//    }
//}