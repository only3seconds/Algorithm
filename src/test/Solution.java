package test;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = {3, 32, 321};
        System.out.println(PrintMinNumber(numbers));
    }
    public static String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "";
        }
        String[] numStr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numStr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(numStr, new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                String c1 = s1 + s2;
                String c2 = s2 + s1;
                return c1.compareTo(c2);
            }
        });

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numStr.length; i++) {
            result.append(numStr[i]);
        }

        return result.toString();
    }
}

