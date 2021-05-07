package ru.job4j.array;

/*
37. Массив без четных значений.
        Метод принимает массив целочисленных значений.
        Необходимо перебрать этот массив выбрать из него только нечетные числа и вернуть новый массив, в котором будут только нечетные числа.
        При этом длина нового массива должна совпадать с количеством нечетных значений в исходном массиве.*/

public class ArrayWithoutEvenElements {

    public static int getCounts(int[] data) {
        int counts = 0;
        for (int datum : data) {
            if (datum % 2 != 0) {
                counts++;
            }
        }
        return counts;
    }

    public static int[] changeData(int[] data) {
        int count = getCounts(data);
        int[] rsl = new int[count];
        int index = 0;
        for (int datum : data) {
            if (datum % 2 != 0) {
                rsl[index++] = datum;
            }
        }
        return rsl;
    }
}
