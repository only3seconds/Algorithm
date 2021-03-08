package string;

import java.util.Scanner;

/**
 * @author thinking-ppp 2020/7/19
 * 1. substring
 * 2. 左闭右开
 */
public class SubstringOperation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNextLine()) {
      String str = sc.nextLine().toString();

      String s1 = str.substring(3);
      String s2 = str.substring(3, 6);
      CharSequence s3 = str.subSequence(3, 6);

      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
    }
  }

}
