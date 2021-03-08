package test;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine().toString();
            String[] strs = str.split(" ");
            int n = strs.length;
            String subStr = str.replaceAll(" ", "");
            int len = subStr.length();

            double result = (double) len / n;
            System.out.println(String.format("%.2f", result));
            //System.out.printf("%.2f", result);

        }
    }
}
