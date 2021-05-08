package ru.job4j.array;

/*40. Инициалы
        Дан массив из трех элементов. В нем записаны соответственно Фамилия Имя Отчество. Ваша задача получить инициалы.

        Например,

        "Иванов", "Роман", "Иваныч" -> "Иванов Р.И."*/

public class Initials {

    public static String takeFirst(char[] array) {
        return array[0] + ".";
    }

    public static String convert(String[] fio) {
        StringBuilder builder = new StringBuilder();
        builder.append(fio[0]).append(" ");
        for (int i = 1; i < fio.length; i++) {
            String st = takeFirst(fio[i].toCharArray());
            builder.append(st);
        }
        return builder.toString();
    }
}
