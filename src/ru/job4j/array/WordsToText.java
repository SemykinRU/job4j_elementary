package ru.job4j.array;

/*42. Объединение слов
        Дан массив слов, необходимо получить текст из этих слов, разделенных пробелом.

        Например,

        {"one", "two", "three"} => "one two three"*/

public class WordsToText {
    public static String convert(String[] words) {
        StringBuilder builder = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {
            builder.append(" ").append(words[i]);
        }
        return builder.toString();
    }
}
