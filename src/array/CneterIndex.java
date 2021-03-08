package array;
import java.util.Scanner;

/**
 * @author thinking-ppp 2020/7/19
 */
public class CneterIndex {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNextLine()) {
      String[] strs = sc.nextLine().toString().split(" ");
      int[] nums = new int[strs.length];

      for (int i = 0; i < strs.length; i++) {
        nums[i] = Integer.parseInt(strs[i]);
      }

//      for (int i = 0; i < nums.length; i++) {
//        System.out.printf(nums[i] + " ");
//      }
      // 1 7 3 6 5 6

      System.out.println(pivotIndex(nums));

    }
  }

  public static int pivotIndex(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    int leftSum = 0;

    for (int i = 0; i < nums.length; i++) {
      int sum0 = sum - nums[i];
      if ((sum0 % 2 == 0) && (leftSum == sum0 / 2)) {
        return i;
      }
      leftSum += nums[i];
    }

    return -1;

  }
}
