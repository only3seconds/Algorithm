package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author thinking-ppp 2020/8/18
 */
public class MostAppear {

  public static void main(String[] args) {
    int[] nums = {1, 2, 3, 1, 2, 2, 1};
    System.out.println(mostAppear(nums));

  }

  public static int mostAppear(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        map.put(nums[i], map.get(nums[i]) + 1);
      } else {
        map.put(nums[i], 1);
      }
    }

    // 找出出现次数最多的"次数"
    int maxAppear = Collections.max(map.values());

    int res = 0;
    for (Entry<Integer, Integer> entry: map.entrySet()) {
      if (entry.getValue() == maxAppear) {
        int left = 0;
        int right = nums.length - 1;
        for (; left < nums.length; left++) {
          if (nums[left] == entry.getKey()) {
            break;
          }
        }

        for (; right >= 0; right--) {
          if (nums[right] == entry.getKey()) {
            break;
          }
        }

        if (right - left + 1 > res) {
          res = right - left + 1;
        }

      } else {

      }
    }

    return res;
  }

}
