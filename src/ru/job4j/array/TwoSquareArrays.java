package ru.job4j.array;

/*Метод принимает 2 двумерных квадратных массива.Вам необходимо реализовать метод
который осуществит конвертацию двумерного массива в одномерный, при этом необходимо выполнить условия:
при переборе двумерных массивов осуществить сравнение элементов, которые стоят на местах с одинаковыми индексами,
и вернуть максимальное из сравниваемых значений.
Максимальное из двух значений необходимо вставить в результирующий массив.*/

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int index = 0;
        int[] array = new int[left.length * right.length];
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left[i].length; j++) {
                if (left[i][j] >= right[i][j]) {
                    array[index] = left[i][j];
                    index++;
                } else {
                    array[index] = right[i][j];
                    index++;
                }
            }
        }
        return array;
    }
}
