package array;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * @author thinking-ppp 2020/8/9
 */
public class TwoSum {

  public static void main(String[] args) {
    int[] nums = {3, 2, 4};
    int[] result = twoSum(nums, 6);
    System.out.println(result[0]);
    System.out.println(result[1]);
  }
  public static int[] twoSum(int[] nums, int target) {
    ArrayList<Integer> list = new ArrayList<>();
    if (target % 2 == 0) {
      for (int i = 0; i < nums.length; i++) {
        if (nums[i] == target / 2) {
          list.add(i);
        }
      }
    }

    if (list.size() == 2) {
      System.out.println("1111");
      int[] result = new int[2];
      result[0] = list.get(0);
      result[1] = list.get(1);
      return result;

    } else {
      System.out.println("2222");
      int[] result = new int[2];
      HashMap<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < nums.length; i++) {
        map.put(nums[i], i);
      }

      for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(target-nums[i]) && target-nums[i] != target / 2) {
          // System.out.println("33333");
          result[0] = i;
          result[1] = map.get(target-nums[i]);
          // System.out.println(result[0]);
          break;
        } else {

        }
      }

      return result;

    }

  }

}
