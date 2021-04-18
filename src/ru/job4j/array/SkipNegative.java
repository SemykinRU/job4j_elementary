package ru.job4j.array;

public class SkipNegative {
    public static int[][] skip(int[][] array) {
       int cell;
        for (int i = 0; i < array.length; i++) {
            cell = array[i].length;
            for (int j = 0; j < cell; j++) {
                if (array[i][j] < 0) {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }
}
