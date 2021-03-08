package test;

import java.util.Stack;

public class X2 {
    static String resolve(String expr) {
        Stack<Integer> stack = new Stack<>();
        int[] num = new int[5000010];
        char[] s = expr.toCharArray();
        int length = s.length;

        for (int i = 0; i < length; i++) {
            if (s[i] == '(')
                stack.push(i);
            else if (s[i] == ')') {
                num[i] = stack.peek();
                num[stack.peek()] = i;
                stack.pop();
            }
        }

        int f = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; ) {
            if (s[i] == '(' || s[i] == ')') {
                i = num[i];
                f = -f;
            } else
                sb.append(s[i]);

            i += f;
        }
        return sb.toString();
    }
}