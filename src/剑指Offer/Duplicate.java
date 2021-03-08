package 剑指Offer;

public class Duplicate {
    public static void main(String[] args) {
        int[] array = {2, 3, 1, 0, 4, 0};
        System.out.println(duplicate(array));

    }

    public static int duplicate(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        for (int i = 0; i < array.length; i++) {
            while (array[i] != i) {
                if (array[array[i]] == array[i]) {
                    return array[i];
                } else {
                    int temp = array[array[i]];
                    array[array[i]] = array[i];
                    array[i] = temp;
                }
            }
        }

        return -1;
    }
}
