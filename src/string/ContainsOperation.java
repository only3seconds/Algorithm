package string;

import java.util.Scanner;

/**
 * @author thinking-ppp 2020/7/19
 * 1. contains
 */
public class ContainsOperation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNextLine()) {
      String str = sc.nextLine().toString();

      System.out.println(str.contains("abc"));
    }
  }

}
