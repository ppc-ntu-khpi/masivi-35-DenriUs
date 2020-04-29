package test;

import domain.Exercise;

public class TestResult {
    public static void main(String[] args) {
        int horizontalSize = 5;
        int verticalSize = 5;
        int firstNumber = 1;

        Exercise.printIntMatrix(Exercise.fiilMatrixGrowingNumbers(new int[horizontalSize][verticalSize], firstNumber));
    }
}