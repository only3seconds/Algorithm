package string;

import java.util.Scanner;

/**
 * @author thinking-ppp 2020/7/19
 * 1. indexOf
 * 2. lastIndexOf
 * 3. 注意：有char和String的操作
 * 4. 注意：有from操作
 * 5. lastIndexOf的from操作是循环遍历字符串进行寻找的
 */
public class IndexOperation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNextLine()) {
      String str = sc.nextLine();

      int firstCharIndex = str.indexOf('a');
      int lastCharIndex = str.lastIndexOf('a');

      int firstStringIndex = str.indexOf("abc");
      int lastStringIndex = str.lastIndexOf("abc");

      int firstCharIndexFrom = str.indexOf('a', 3);
      int lastCharIndexFrom = str.lastIndexOf('a', 5);

      int firstStringIndexFrom = str.indexOf("abc", 3);
      int lastStringIndexFrom = str.lastIndexOf("abc", 5);

      //System.out.println(firstCharIndex + "," + lastCharIndex);
      //System.out.println(firstStringIndex + "," + lastStringIndex);
      System.out.println(firstCharIndexFrom + "," + lastCharIndexFrom);
      System.out.println(firstStringIndexFrom + "," + lastStringIndexFrom);
    }
  }

}
