package pinduoduo;
/**
 * 给定一个字符串，按顺时针顺序输出为一个正方形，具体规则如下；
 * 1.从上边开始，上边从左到右
 * 2.然后到右边，右边从上到下
 * 3.然后是下边，下边从右到左
 * 4.最后是左边，左边从下到上
 *
 * 输入：
 * abdcefghijklmnop
 *
 * 输出：
 * abcde
 * p   f
 * o   g
 * n   h
 * mlkji
 */

import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = str.length() / 4;
        String space = "";
        for (int i = 0; i < k - 1; i++) {
            space += " ";
        }

        for (int i = 0; i < k + 1; i++) {
            if (i == 0) {
                System.out.println(str.substring(0, k + 1));
            } else if (i == k) {
                System.out.println(new StringBuilder(str.substring(2 * k, 3 * k + 1)).reverse().toString());
            } else {
                System.out.println(str.charAt(4 * k - i) + space + str.charAt(k + i));
            }
        }
    }
}
