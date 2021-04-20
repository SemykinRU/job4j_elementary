package ru.job4j.array;

/*Привести строку к верхнему регистру   */

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] outCharArray = new  char[string.length];
        for (int i = 0; i < string.length; i++) {
            if (Character.isLowerCase(string[i])) {
                outCharArray[i] = Character.toUpperCase(string[i]);
            } else {
                outCharArray[i] = string[i];
            }
        }
        return outCharArray;
    }
}
