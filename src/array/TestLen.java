package array;

import java.util.Arrays;

/**
 * @author thinking-ppp 2020/8/9
 */
public class TestLen {

  public static void main(String[] args) {
    String[][] strs = new String[5][3];
    strs[0] = new String[]{"15295668721", "0", "1"};
    strs[1] = new String[]{"18855582201", "2", "1"};
    strs[2] = new String[]{"15155094114", "1", "0"};
    System.out.println(strs.length);

    for (int i = 0; i < strs.length; i++) {
      if (strs[i][0] != null) {
        for (int j = 0; j < strs[0].length; j++) {
          System.out.print(strs[i][j] + " ");
        }
        System.out.println();
      }
      }

  }



}
