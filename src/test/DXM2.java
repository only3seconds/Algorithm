package test;

import java.util.Scanner;

public class DXM2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.valueOf(sc.nextLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.valueOf(sc.nextLine());

            if (n <= 1) {
                System.out.println(0);
            } else if (n == 2) {
                System.out.println(2);
            } else if (n == 3) {
                System.out.println("11" + "/" + "3");
            }
        }

    }
}
