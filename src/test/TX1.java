package test;

import java.util.Scanner;

public class TX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int length = sc.nextInt();
            sc.nextLine();
            String number = sc.nextLine();

            if (length < 11) {
                System.out.println("NO");
            } else {
                int index = number.indexOf("8");
                if (index == -1) {
                    System.out.println("NO");
                } else {
                    int len = number.length() - index;
                    if (len >= 11) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }

            }
        }
    }
}
