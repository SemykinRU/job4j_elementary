package ru.job4j.ru.job4j.loop;

/*Дано число, нужно получить сумму его цифр

        Например,

        12 => 1 + 2 => 3*/

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
       StringBuilder stringBuilder = new StringBuilder(String.valueOf(num));
        for (int i = 0; i < stringBuilder.length(); i++) {
            if (Character.isDigit(stringBuilder.charAt(i))) {
                sum += Character.getNumericValue(stringBuilder.charAt(i));
            }
        }
//Операция получения остатка от деления деления на 10 (вернет младший разряд числа) и целочисленного деления на 10 (эквивалентна сдвигу числа вправо).
/*while (num != 0) {
    sum += num % 10;
    num /= 10;

}*/
        return sum;
    }
}
