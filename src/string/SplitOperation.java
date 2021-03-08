package string;

import java.util.Scanner;

/**
 * @author thinking-ppp 2020/7/19
 * 1. 按照空格" "进行分割时，注意连续多个空格的情况，每个空格" "都会被当作分割的依据，如果空格后面还是空格，则分出空串""，测试用例："This is a good   man!"
 * 2. 按照\进行分割的时候，注意进行转义
 * 3. split(regex, limit) limit的意思是按照regex分成limit段
 */
public class SplitOperation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (sc.hasNextLine()) {
      String str = sc.nextLine().toString();

      String[] strs1 = str.split(" ");
      String[] strs2 = str.split("\\\\");
      String[] strs3 = str.split(" ", 3);

//      for (int i = 0; i < strs1.length; i++) {
//        System.out.printf(strs1[i]+"#");
//      }
//      System.out.println();
//
//      for (int i = 0; i < strs2.length; i++) {
//        System.out.printf(strs2[i] + " ");
//      }
//      System.out.println();

      for (int i = 0; i < strs3.length; i++) {
        System.out.println(strs3[i]);
      }
    }
  }

}
