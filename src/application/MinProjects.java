package application;

import java.util.Arrays;

/**
 * 百度笔试
 */
public class MinProjects {
    public static void main(String[] args) {

    }

    public int minNumberOfProjects(int num, int projCmptDec, int restDes, int[] errorScore) {
        Arrays.sort(errorScore);
        int result = 0;

        for (int i = num - 1; i >= 0; i--) {
            while (errorScore[i] >= (num-i)) {
                errorScore[i] -= projCmptDec;
                result++;
                for (int j = num - 1; j >= 0; j--) {
                    if (j != i) {
                        if (errorScore[j] >= restDes) {
                            errorScore[j] -= restDes;
                        } else {
                            errorScore[j] = 0;
                        }
                    }
                }
            }

        }

        return result;
    }
}
