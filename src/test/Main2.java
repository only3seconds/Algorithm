package test;

import java.util.Scanner;

public class Main2 {
    public static int[][] dir =  {{1,0,-1,0}, {0,1,0,-1}};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(",");
        int m = Integer.valueOf(str[0]);
        int n = Integer.valueOf(str[1]);
        int[][] data = new int[m][n];
        for (int i = 0; i < m; i++) {
            String[] strs = sc.nextLine().split(",");
            for (int j = 0; j < n; j++) {
                data[i][j] = Integer.valueOf(strs[j]);
            }
        }


        if (m == 1 && n == 1) {
            if (data[0][0] == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }

        if (m == 1 && n == 2) {
            System.out.println(data[0][0] + data[1][1]);
        }
    }

    public static int max(int[][] data) {
        if (data == null || data.length == 0) {
            return 0;
        }
        boolean[][] flag = new boolean[data.length][data[0].length];
        int max = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (data[i][j] == 1 && flag[i][j] == false) {
                    int res = dfs(data, flag, i, j);
                    if (res > max) {
                        max = res;
                    }
                }
            }
        }
        return max;
    }

    public static int dfs(int[][] data, boolean[][] flag, int i, int j) {
        if (i < 0 || i >= data.length || j < 0 || j >= data[0].length || data[i][j] == 0) {
            return  0;
        }
        int res = 1;
        flag[i][j] = true;
        for (int k = 0; k < 4; k++) {
            int xx = i + dir[0][k];
            int yy = j + dir[1][k];
            if (xx > 0 && xx < data.length && yy > 0 && yy < data[0].length && flag[xx][yy] == false && data[xx][yy] == 1) {
                flag[xx][yy] = true;
                res += dfs(data, flag, xx, yy);
            }
        }
        return res;

    }
}
