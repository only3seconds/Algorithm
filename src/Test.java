import java.util.ArrayList;

public class Test {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int row1 = 0;
        int row2 = row - 1;
        int column1 = 0;
        int column2 = column - 1;
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        while (row1 <= row2 && column1 <= column2) {
            temp = printMatrix(matrix, row1, row2, column1, column2);
            result.addAll(temp);
            row1++;
            row2--;
            column1++;
            column2--;
        }
        return result;

    }

    public ArrayList<Integer> printMatrix(int[][] matrix, int row1, int row2, int column1, int column2) {
        ArrayList<Integer> list = new ArrayList<>();
        if (row1 == row2) {
            for (int j = column1; j <= column2; j++) {
                list.add(matrix[row1][j]);
            }
        } else if (column1 == column2) {
            for (int i = row1; i <= row2; i++) {
                list.add(matrix[i][column2]);
            }
        } else {
            for (int j = column1; j <= column2; j++) {
                list.add(matrix[row1][j]);
            }

            for (int i = row1 + 1; i <= row2; i++) {
                list.add(matrix[i][column2]);
            }

            for (int j = column2 - 1; j >= column1; j--) {
                list.add(matrix[row2][j]);
            }

            for (int i = row2 - 1; i > column1; i--) {
                list.add(matrix[i][column1]);
            }
        }

        return list;
    }
}