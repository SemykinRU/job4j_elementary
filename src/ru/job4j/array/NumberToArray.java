package ru.job4j.array;

/*41. Массив цифр
        Дано число int. Нужно получить массив из его цифр в обратном порядке.

        Например

        12345 => {5, 4, 3, 2, 1}*/

public class NumberToArray {

    public static int[] resolve(int number) {
        StringBuilder builder = new StringBuilder();
        builder.append(number).reverse();
        int[] rsl = new int[builder.length()];
        for (int i = 0; i < builder.length(); i++) {
            rsl[i] = Integer.parseInt(String.valueOf(builder.charAt(i)));
        }
        return rsl;
    }
}
