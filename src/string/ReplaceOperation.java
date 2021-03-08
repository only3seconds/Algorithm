package string;

import java.util.Scanner;

/**
 * @author thinking-ppp 2020/7/19
 * 1. replace(char, char) 字符替换，全部替换
 * 2. replace(charSequence, charSequence) 字符串替换，全部替换
 * 3. replaceAll(String, String) 字符串替换，全部替换，replaceAll的参数是regex或者char,基于规则表达式的替换,比如,可以通过replaceAll("\\d", "*")把一个字符串所有的数字字符都换成星号
 */
public class ReplaceOperation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNextLine()) {
      String str = sc.nextLine().toString();

      String s1 = str.replace('a', 'b');
      String s2 = str.replace("abc", "ppp");
      String s3 = str.replaceAll("abc", "ppp");
      String s4 = str.replaceFirst("abc", "ppp");

      String s5 = str.replaceAll("\\d", "ppp");

//      System.out.println(s1);
//      System.out.println(s2);
//      System.out.println(s3);
//      System.out.println(s4);
      System.out.println(s5);


    }
  }

}
