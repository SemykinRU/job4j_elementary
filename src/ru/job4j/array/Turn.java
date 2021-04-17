package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        int count = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            temp = array[i];
            array[i] = array[count];
            array[count] = temp;
            count--;
            if (i == count || i > count) {
                break;
            }
        }
        return array;
    }
}
