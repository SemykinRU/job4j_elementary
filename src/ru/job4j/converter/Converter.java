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
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        in = 360;
        expected = 6;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("360 rubles are 6. Test result : " + passed);
        in = 3;
        expected = 210;
        out = Converter.euroToRub(in);
        passed = expected == out;
        System.out.println("3 euro are 210 rubles. Test result : " + passed);
        in = 5;
        expected = 300;
        out = Converter.usdToRub(in);
        passed = expected == out;
        System.out.println("5 usd are 300 rubles. Test result : " + passed);

        /*System.out.println("usd = 60 rubles");
        System.out.println("euro = 70 rubles");
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int usd = Converter.rubleToDollar(360);
        System.out.println("360 rubles are " + usd + " usd.");
        int rubFromEuro = euroToRub(20);
        int rubFromUsd = usdToRub(70);
        System.out.println("20 euro are " + rubFromEuro + " rubles.");
        System.out.println("70 dollars are " + rubFromUsd + " rubles.");
*/
    }
}
