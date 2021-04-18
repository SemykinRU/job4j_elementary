package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        int tempValue;
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, i, data.length - 1);
            tempValue = min;
            data[index] = data[i];
            data[i] = tempValue;
        }
        return data;
    }
}
