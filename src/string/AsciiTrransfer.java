package string;

import java.util.Scanner;

/**
 * @author thinking-ppp 2020/7/25
 */
public class AsciiTrransfer {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNextLine()) {
      String[] strs = sc.nextLine().toString().split(" ");
      int count = 0;

      for (int i = 0; i < strs.length; i++) {
        int num = Integer.parseInt(strs[i],16);
        if ((('a' <= num) && (num <= 'z')) || (('A' <= num) && (num <= 'Z')) ) {
          System.out.println((char)num);
          count++;
        }
      }

      System.out.println(count);
    }
  }

}
