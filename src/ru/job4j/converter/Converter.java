package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70; /* формула перевода рублей в евро. */
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }
    public static int euroToRub(int value) {
        int rsl = value * 70; /* формула перевода евро в рубли. */
        return rsl;
    }

    public static int usdToRub(int value) {
        int rsl = value * 60; /* формула перевода доллары в рубли. */
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println("usd = 60 rubles");
        System.out.println("euro = 70 rubles");
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int usd = Converter.rubleToDollar(360);
        System.out.println("360 rubles are " + usd + " usd.");
        int rubFromEuro = euroToRub(20);
        int rubFromUsd = usdToRub(70);
        System.out.println("20 euro are " + rubFromEuro + " rubles.");
        System.out.println("70 dollars are " + rubFromUsd + " rubles.");
    }
}
