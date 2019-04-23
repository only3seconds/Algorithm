package application;

import java.util.Scanner;

/**
 * 拼多多笔试
 * 自动售货机有N瓶复制可乐。复制可乐非常神奇，喝了它的人会复制出一个自己来！
 * 现在有Alice,Bob,Cathy,Dave四个人在排队买复制可乐。
 * 买完的人会马上喝掉，然后他和他的副本会重新去队伍的最后面排队买可乐。
 * 问最后一个买到复制可乐的人叫什么名字?
 */
public class CopyCola {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] names = {"Alice", "Bob", "Cathy", "Dave"};
        int level = 0;
        int levelCount;
        int sum = 0;

        while (sum < n) {
            levelCount = (int) (4 * Math.pow(2, level));
            sum += levelCount;
            level++;
        }

        //计算差值，即最后一层多余的人
        int diff = sum - n;
        int lastEachCount = (int) Math.pow(2, level - 1);
        int index = 3;

        //这里注意边界条件
        while (diff >= 0) {
            diff -= lastEachCount;
            index--;
        }
        System.out.println(names[index + 1]);

    }
}
