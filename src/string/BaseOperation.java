package string;

import java.util.Scanner;

public class BaseOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str = sc.nextLine();

            // 字符串的长度
            int len = str.length();

            // 字符串中第 i 个字符
//            char c = str.charAt(1);

            // 第一个空格的下标
            int index = str.indexOf(" ");
            // 最后一个空格的下标
            int lastIndex = str.lastIndexOf(" ");

            // 分割字符串
            String[] strs = str.split("\\\\"); //按 \ 进行分割

            // 判断是否包含某个子串
            boolean ifHas = str.contains("abc");
            // 字符串某个子串出现的首个位置，-1表示不存在该字符串
            int subIndex = str.indexOf("ppp");

            // 字符串中字符替换
            str = str.replace("abc", "ppp");

            // 全部转换成大写/小写
            String upperStr = str.toUpperCase();
            String lowerStr = str.toLowerCase();

            // 字符串截取,左闭右开
//            String str1 = str.substring(3);
//            String str2 = str.substring(3, 5);

            // 十六进制字符串转换为十进制
//            int decimal = Integer.parseInt(str, 16);
            // 十进制转换为十六进制字符串
            String hex = Integer.toHexString(171);
            // 十进制转换为二进制字符串
//            String binary = Integer.toBinaryString(Integer.valueOf(str));

            // 字符串转换为数字
//            int num = Integer.valueOf(str);
            // 数字转换为字符串
            String s1 = String.valueOf(124);
            // 字符转换为字符串
            String s2 = String.valueOf('a');

            // 字符串逆转
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();

            // 去掉字符串首尾的空格
            String trimStr = str.trim();

            // 字符串转换为字符数组
            char[] chars = str.toCharArray();

            // （字符）数组的长度
            int len2 = chars.length;

            // 比较字符是否相等
//            boolean ifCharEqual = str.charAt(0) > str.charAt(1);
            // 比较字符串是否相等
            boolean ifStrEqual = str.equalsIgnoreCase("abc");

            char b = 'a' + 1;
            System.out.println(str);
//            System.out.println(s2);
//            System.out.println(Arrays.toString(strs));

        }
    }
}
