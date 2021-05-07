package ru.job4j.array;

import java.util.Arrays;
//35. Исключить элементы из двумерного массива.
/*Необходимо реализовать метод который вернет одномерный массив, который не будет содержать значений 0 (необходимо использовать метод Arrays.copyOf()). При этом исходные данными будут следующими:

        1. Квадратный двумерный массив целочисленных значений data.

        2. Целочисленный элемент sum, который означает сумму индексов в массиве.

        При этом необходимо чтобы выполнились следующие условия:

        1. Если сумма индексов при переборе двумерного массива равна sum, то элемент с такими индексами должен принять значение 0.

        2. Выходной одномерный массив не должен содержать значения 0.*/

public class CheckSumIndexes {

    public static void sortArray(int[] array, int index) {
        int temp;
        for (int i = index; i < array.length - 1; i++) {
            temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
    }

    public static int counts(int[][] data) {
        int count = 0;
        for (int[] datum : data) {
            count += datum.length;
        }
        return count;
    }

    public static int[] collectNewArray(int[][] data, int sum) {
        int count = counts(data);
        int[] rsl = new int[count];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == sum) {
                    data[i][j] = 0;
                    count--;
                }
                rsl[index++] = data[i][j];
            }
        }
        for (int i = 0; i < rsl.length - 1; i++) {
            if (rsl[i] == 0) {
                sortArray(rsl, i);
            }
        }

        return Arrays.copyOf(rsl, count);
    }
}
