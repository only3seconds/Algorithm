package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strA[] = sc.nextLine().split(" ");
        String strB[] = sc.nextLine().split(" ");

        int[] arrayA = new int[strA.length];
        int[] arrayB = new int[strB.length];

        for (int i = 0; i < strA.length; i++) {
            arrayA[i] = Integer.valueOf(strA[i]);
        }
        for (int i = 0; i < strB.length; i++) {
            arrayB[i] = Integer.valueOf(strB[i]);
        }

        int toReplace = 0;
        for (int i = 0; i < arrayA.length - 1; i++) {
            if (arrayA[i + 1] <= arrayA[i]) {
                toReplace = i + 1;
            }
        }

        Arrays.sort(arrayB);
        boolean find = false;

        if (toReplace == 0) {
            for (int j = arrayB.length - 1; j >= 0; j--) {
                if (arrayB[j] < arrayA[toReplace + 1]) {
                    arrayA[toReplace] = arrayB[j];
                    find = true;
                    break;
                }
            }
        }
        if (toReplace == arrayA.length - 1) {
            for (int j = arrayB.length - 1; j >= 0; j--) {
                if (arrayB[j] > arrayA[toReplace - 1]) {
                    arrayA[toReplace] = arrayB[j];
                    find = true;
                    break;
                }
            }
        }
        if (toReplace > 0 && toReplace < arrayA.length - 1) {
            for (int j = arrayB.length - 1; j >= 0; j--) {
                if (arrayB[j] > arrayA[toReplace - 1] && arrayB[j] < arrayA[toReplace + 1]) {
                    arrayA[toReplace] = arrayB[j];
                    find = true;
                    break;
                }
            }
        }

        if (!find) {
            System.out.println("No");
        } else {
            for (int i = 0; i < arrayA.length; i++) {
                System.out.print(arrayA[i] + " ");
            }
        }

    }
}
