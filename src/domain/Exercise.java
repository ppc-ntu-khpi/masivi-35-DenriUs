package domain;

import java.util.Arrays;

public class Exercise {
    /**
     * Method that fill numeric matrix with numbers that equals to sum of two previous numbers
     * @param matrix numeric matrix
     * @param firstNumber first number for start filling
     * @return filled numeric matrix
     */
    public static int[][] fiilMatrixGrowingNumbers(int[][] matrix, int firstNumber) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == 0 && (j == 0 || j == 1)) {
                    matrix[i][j] = firstNumber;
                } else {
                    if (i > 0 && (j == 0 || j == 1)) {
                        if (j == 0) {
                            matrix[i][j] = matrix[i - 1][matrix[0].length - 1] + matrix[i - 1][matrix[0].length - 2];
                        } else {
                            matrix[i][j] = matrix[i][j - 1] + matrix [i - 1][matrix[0].length - 1];
                        }
                    } else {
                        matrix[i][j] = matrix[i][j - 1] + matrix[i][j - 2];
                    }
                }
            }
        }

        return matrix;
    }
    
    /**
     * Method that print numeric matrix
     * @param matrix numeric matrix
     */
    public static void printIntMatrix(int[][] matrix) {
        System.out.println();
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
} 