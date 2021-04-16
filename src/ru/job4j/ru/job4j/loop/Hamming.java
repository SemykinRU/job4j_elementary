package ru.job4j.ru.job4j.loop;

public class Hamming {
    public static int checkStrings(String left, String right) {
        int value = 0;
        for (int i = 0; i < right.length(); i++) {
            if (left.charAt(i) != right.charAt(i)) {
                value++;
            }
        }
    return value;
}
}
