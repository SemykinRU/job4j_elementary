package ru.job4j.array;

/*Метод принимает массив целочисленных значений. Необходимо реализовать метод,
который превратит одномерный массив в квадратный двумерный. Напомню,
что квадратный двумерный массив - это массив, в котором число рядов и элементов в каждом ряду одинаково.
При этом если элементов в исходном массиве не хватает, чтобы заполнить весь двумерный массив - необходимо заполнить его 0.*/

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {

        int indexRow = 0; //Счетчик строк в новом массиве.
        int indexCell = 0; // Счетчик колонок в новом массиве.
        int indexArray = array.length; //Счетчик для определения квадратной матрицы indexRow * indexCell == indexArray.
        /*Выясняем, сколько нужно строк и колонок для нашей квадратной матрицы*/
        while (indexCell * indexRow != indexArray) {
            if (indexCell * indexRow < indexArray) {
                indexCell++;
                indexRow++;
            } else {
                indexArray++;
            }
        }

        int indexDip = indexCell; //Диапозон от i до indexDip - будем идти по основному массиву.
        int count = indexCell; //Наш увеличитель диапозона, служит, что бы мы не вышли за рамки нашей строки в матрице.

      int[][] data = new int[indexRow][indexCell];
      /*Сбрасываем наши идексы строк и колонок в 0*/
        indexCell = 0;
        indexRow = 0;

        for (int i = 0; i < array.length; i++) {
            if (i < indexDip) {
                data[indexRow][indexCell] = array[i];
                indexCell++;
            } else {
                indexDip += count; //Увеличиваем наш диапозон поиска на кол-во максимальных столбцов в строке.
                indexCell = 0;
                indexRow++;
                i--;
            }
        }

        return data;
    }
}
