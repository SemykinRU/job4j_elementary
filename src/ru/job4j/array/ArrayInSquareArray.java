package ru.job4j.array;

/*Метод принимает массив целочисленных значений. Необходимо реализовать метод,
который превратит одномерный массив в квадратный двумерный. Напомню,
что квадратный двумерный массив - это массив, в котором число рядов и элементов в каждом ряду одинаково.
При этом если элементов в исходном массиве не хватает, чтобы заполнить весь двумерный массив - необходимо заполнить его 0.*/

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int indexRow = 0;
        int indexCell = 0;
        int indexArray = array.length;
        while (indexCell * indexRow != indexArray) {
            if (indexCell * indexRow < indexArray) {
                indexCell++;
                indexRow++;
            } else {
                indexArray++;
            }
        }
        int value = indexCell;
        indexArray = indexCell;
      int[][] data = new int[indexRow][indexCell];
        indexCell = 0;
        indexRow = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < value) {
                data[indexRow][indexCell] = array[i];
                indexCell++;
            } else {
                value += indexArray;
                indexCell = 0;
                indexRow++;
                i--;
            }
        }

        return data;
    }
}
