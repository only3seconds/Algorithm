package test;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double[] a = new double[n];
        String[] str = sc.nextLine().split(" ");
        for (int i = 0; i < str.length; i++) {
            a[i] = Double.parseDouble(str[i]);
        }
        double[] a2 = new double[n];
        for (int i = 0; i < str.length; i++) {
            a2[i] = Double.parseDouble(str[i]);
        }


        Arrays.sort(a);
        double[] b = new double[n];
        for (int j = 0; j < n; j++) {
            b[j] = ((double) (j) / (double) (n)) * 100;
        }
        int q = Integer.parseInt(sc.nextLine());

        while (sc.hasNext()) {
            int i = Integer.parseInt(sc.nextLine());
            double score = a2[i-1];
            int index = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] == score) {
                    index = j;

                }
            }
            DecimalFormat df = new DecimalFormat("#.000000");
            System.out.println(df.format(b[index]));

        }

    }
}
