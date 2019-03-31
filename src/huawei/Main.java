package huawei;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = Integer.valueOf(sc.nextLine());
            String str = sc.nextLine();
            String[] strs = new String[n];
            int j = 0;
            String result = "";

            while (str.length() > 0) {
                String s = str.substring(0, 9);
                strs[j] = s;
                j++;
                str = str.substring(9);
            }

            for (int i = 0; i < strs.length; i++) {
                if (strs[i].charAt(0) == '0') {
                    StringBuilder sb = new StringBuilder(strs[i].substring(1)).reverse();
                    result += sb.toString() + " ";
                } else if (strs[i].charAt(0) == '1') {
                    result += strs[i].substring(1) + " ";
                }
            }

            System.out.println(result.trim());

        }
    }
}