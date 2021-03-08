package test;

/**
 * @author thinking-ppp 2020/1/5
 */
public class Leetcode153 {
  public int findMin(int[] nums) {
    int low = 0;
    int high = nums.length-1;

    while (low < high) {
      int middle = low + (high - low) / 2;
      if (nums[middle] < nums[high]) {
        high = middle;
      } else {
        low = middle + 1;
      }
    }

    return nums[low];

  }
}
