package ru.job4j.array;

/*Вам нужно переставить две строки в матрице, с учетом, что длины строк одинаковые. src, dest это индексы строк*/

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        int temp;
        for (int i = src; i <= src; i++) {
            for (int j = 0; j < data[src].length; j++) {
                temp = data[i][j];
                data[i][j] = data[dst][j];
                data[dst][j] = temp;
            }
        }
    }
}
