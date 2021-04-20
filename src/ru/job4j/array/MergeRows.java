package ru.job4j.array;

/*Дана квадратная матрица. Ваша задача объединить ее строки в один массив

Например, для {{1, 2}, {3, 4}} получить {1, 2, 3, 4}*/

public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] array = new int[data.length * data.length];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                array[index] = data[i][j];
                index++;
            }
        }
        return array;
    }
}
