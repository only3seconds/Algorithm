package string;

import java.util.Scanner;

/**
 * 拼多多笔试
 * 字符串形式的正整数（可能包含前缀0,  1<=length<=10），先将这个字符串拆成两部分，接着可以在这两部分中分别加入一个小数点也可以不加入，分别形成一个整数或小数，找出所有经“拆分”和“变化”两次操作后所有可能组合的数目。
 * 要求：
 * 1、对于新形成的整数和小数，不可包含多余的前缀0，比如010和010.1不合法；
 * 2、对于小数，不可包含多余的后缀0，比如0.10不合法；
 * 3、.1和1.这样的小数不合法。
 * 输入：
 * 123
 * 输出：
 * 4
 * 说明：
 * 可能的组合如下：
 * [[1, 23], [12, 3], [1.2, 3], [1, 2.3]]
 * 输入：
 * 00011
 * 输出：
 * 2
 * 说明：
 * 可能的组合如下：
 * [[0.001, 1], [0, 0.011]]
 */
public class InterstringChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = 0;

        //根据间隔，确定几种分发
        for (int i = 0; i < str.length()-1; i++) {
            String left = str.substring(0, i+1);
            String right = str.substring(i+1, str.length());
            result += getCount(left) * getCount(right);
        }

        System.out.println(result);
    }

    public static int getCount(String subStr) {
        if(subStr.length() == 1) {
            return 1;
        }

        if (subStr.charAt(0) == '0') {
            if (subStr.charAt(subStr.length() - 1) == '0') {
                return 0;
            } else {
                return 1;
            }
        } else {
            if (subStr.charAt(subStr.length() - 1) == '0') {
                return 1;
            } else {
                return subStr.length();
            }
        }
    }
}
