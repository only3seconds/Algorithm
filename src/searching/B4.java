package searching;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        String[] strs = sc.nextLine().split(" ");
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.valueOf(strs[i]);
        }

        //找到分界点
        int index = -1;
        for (int i = 0; i < n - 1; i++) {
            if (array[i + 1] < array[i]) {
                index = i + 1;
                break;
            }
        }

        //单调递增
        if (index == -1) {
            System.out.println(0);
        }

        int index2 = -1;
        int sum = 0;
        for (int j = index; j < n - 1; j++) {
            if (array[j + 1] > array[j]) {
                index2 = j + 1;
                break;
            }
        }

        //已经满足要求
        if (index2 == -1) {
            System.out.println(0);
        }

        if (array[index2] >= array[index]) {
            sum += array[index - 1] + 1 - array[index];
            sum += array[index] + 1 - array[index + 1];
            System.out.println(sum);
        }


    }
}
