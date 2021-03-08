package test;

import java.util.Scanner;

public class DXM1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > n || b > m) {
            System.out.println(0);
        } else {
            int count1 = n - a + 1;
            int count2 = m - b + 1;
            int count = count1 + count2;

            if (a == n && b == m) {
                System.out.println(9);
            } else {
                System.out.println(9 * count);
            }
        }


    }
}
