package ru.job4j.array;

//31. Конвертировать неквадратный двумерный массив в квадратный.

public class Converter {

    public static int[][] convertInSquareArray(int[][] array) {
        int value = 0;
        for (int[] counts : array) {
            for (int i = 0; i < counts.length; i++) {
                value++;
            }
        }
        while (true) {
           int count = (int) (Math.sqrt(value) + 0.5);
           if (count * count == value) {
               value = count;
               break;
           }
           value++;
        }
        int[][] newArray = new int[value][value];

        int row = 0;
        int cell = 0;

        for (int[] ints : array) {
            for (int anInt : ints) {
                newArray[row][cell] = anInt;
                if (cell < value - 1) {
                    cell++;
                } else {
                    cell = 0;
                    row++;
                }
            }
        }

        return newArray;
    }
}
