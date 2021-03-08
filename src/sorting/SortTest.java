package sorting;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author thinking-ppp 2020/8/26
 */
public class SortTest {

  public static void main(String[] args) {
    int[] ints = {1, 5, 4, 2, 7};
    Arrays.sort(ints);

    Integer[] integers = new Integer[5];
    for (int i = 0; i < 5; i++) {
      integers[i] = ints[i];
    }
    Arrays.sort(integers, Collections.<Integer>reverseOrder());
    System.out.println(Arrays.toString(integers));
  }

}
