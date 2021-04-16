package ru.job4j.ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        if (s.isEmpty()) {
            s = "empty";
            return s;
        }
        StringBuilder stringBuilder = new StringBuilder(s);
        if (s.length() > 4) {
            for (int i = 0; i < s.length() - 4; i++) {
            stringBuilder.setCharAt(i, '#');
            }
        }
        return stringBuilder.toString();
    }
}
