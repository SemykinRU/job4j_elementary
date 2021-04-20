package ru.job4j.array;

/*Вам дана квадратная матрица. Нужно получить правую диагональ. Правая диагональ это диагональ матрицы, которая идет справа налево.
Например, для {{1, 2}, {3, 4}} это будет {2, 3}, левой в этом случае будет {1, 4}*/

public class RightDiagonal {
    public static int[] diagonal(int[][] data) {
        int[] array = new int[data.length];
        int cellIndex = data[0].length - 1;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                array[i] = data[i][cellIndex];
            }
            cellIndex--;
        }

        return array;
    }
}
