package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        int cell;
        for (int i = 0; i < array.length; i++) {
            cell = array[i].length;
            for (int j = 0; j < cell; j++) {
                rsl += array[i][j];
            }
        }
        return rsl;
    }
}
