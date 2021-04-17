package ru.job4j.ru.job4j.loop;

/*Метод принимает строку, которая состоит из нескольких слов каждое из которых начинается с прописной буквы. */
/*Необходимо из полученной строки сформировать аббревиатуру. */
public class Abbreviation {
    public static String collect(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        s = s.trim();
        char[] charArray = s.toCharArray();
        if (s.isEmpty()) {
            return "isEmpty";
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase(charArray[i])) {
                  stringBuilder.append(charArray[i]);
                }
            }
            return stringBuilder.toString();
        }
    }
}
