package string;

import java.util.Scanner;

/**
 * @author thinking-ppp 2020/7/19
 */
public class BaseConversion {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNextLine()) {
      int num = sc.nextInt();

      // 10进制 -> 2进制
      String _10BaseTo2 = Integer.toBinaryString(num);
      // 10进制 -> 8进制
      String _10BaseTo8 = Integer.toOctalString(num);
      // 10进制 -> 16进制
      String _10Base16 = Integer.toHexString(num);

      String str = Integer.toString(num);
      int _16BaseTo10 = Integer.parseInt(str, 16);



    }
  }

}
