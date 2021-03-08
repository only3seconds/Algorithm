package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class S1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toString();
        char[] charArray = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        if (!(charArray == null || charArray.length == 0)) {
            for (int i = 0; i < charArray.length; i++)
                if (map.get(charArray[i]) != null)
                    map.put(charArray[i], map.get(charArray[i]) + 1);
                else
                    map.put(charArray[i], 1);
        }

        int max = map.get(charArray[0]);
        for (int j = 0; j < charArray.length; j++)
            if (max < map.get(charArray[j])) {
                max = map.get(charArray[j]);
            }

        System.out.println(max);
    }
}  