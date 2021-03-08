package string;

import java.util.Scanner;

/**
 * @author thinking-ppp 2020/7/19
 * 1. charAt
 * 2. toCharArray
 */
public class CharAtOperation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNextLine()) {
      String str = sc.nextLine().toString();

      System.out.println(str.charAt(4));

      char[] chs = str.toCharArray();
      for (int i = 0; i <chs.length; i++) {
        System.out.printf(chs[i] + ""); //注意char字符的输出需要+"" 转换成字符串类型的
      }
    }
  }

}
