package test;

import java.util.Stack;

public class xiaomi1 {
    public static void main(String[] args) {

    }

    static String solution(String[] input) {
        int n = input.length;
        int m = input[0].length();
        int[][] data = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                data[i][j] = Integer.valueOf(input[i].charAt(j));
            }
        }

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < n; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = 0; j < m; j++) {
                if (data[i][j] != 0) {
                    if (stack.isEmpty()) {
                        stack.add(data[i][j]);
                    } else {
                        if (stack.peek() == data[i][j]) {
                            stack.add(stack.pop()*2);
                        } else {
                            stack.add(data[i][j]);
                        }
                    }
                }
            }
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (data[i][j] == data[i][j+1]) {
                    data[i][j] += data[i][j+1];
                    data[i][j+1] = 0;
                }
            }
            for (int a = 0; a < m; a++) {
                for (int b = 0; b < n; b++) {
                    for (int c = b; c >= 0; c--) {
                        if (data[a][b] != 0 && data[a][c] == 0) {
                            data[a][c] = data[a][b];
                            data[a][b] = 0;
                        }
                    }
                }
            }

        }

        for (int i = 0; i < m; i++) {
            sb.append(data[i]);
            sb.append("\n");
        }

        return sb.toString();

    }
}
