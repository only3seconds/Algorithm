package specialAlgorithm;

import java.util.Scanner;

/**
 * 旅行商问题
 */
public class TravelingSalesman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int result2 = 0;

        while (sc.hasNext()) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();
            int x4 = sc.nextInt();
            int y4 = sc.nextInt();
            int x5 = sc.nextInt();
            int y5 = sc.nextInt();

            double oa = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
            double ab = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
            double bc = Math.sqrt(Math.pow(x2-x3, 2) + Math.pow(y2-y3, 2));
            double cd = Math.sqrt(Math.pow(x3-x4, 2) + Math.pow(y3-y4, 2));
            double de = Math.sqrt(Math.pow(x4-x5, 2) + Math.pow(y4-y5, 2));
            double eo = Math.sqrt(Math.pow(x5, 2) + Math.pow(y5, 2));

            double ob = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));
            double ao = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
            double bc1 = Math.sqrt(Math.pow(x2-x3, 2) + Math.pow(y2-y3, 2));
            double cd2 = Math.sqrt(Math.pow(x3-x4, 2) + Math.pow(y3-y4, 2));
            double de2 = Math.sqrt(Math.pow(x4-x5, 2) + Math.pow(y4-y5, 2));
            double ea = Math.sqrt(Math.pow(x5-x1, 2) + Math.pow(y5-y1, 2));

            result += (int)(oa+ab+bc+cd+de+eo);
            result2 += (int)(ao+ob+bc1+cd2+de2+ea);


            if (result <= result2) {
                System.out.println(result);
            }else {
                System.out.println(result2);
            }

        }
    }
}
