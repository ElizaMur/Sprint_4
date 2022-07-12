package ru.yandex.praktikum;

public class Account {
    private String name = null;
    static int counter = 0;
    public Account(String name) {
        this.name = name;
    }

    public static boolean checkNameToEmboss(final String name) {
        counter = name.length() - name.replaceAll(" ", "").length();

        if ((name.length() < 3 | name.length() > 18) | (name.startsWith(" ") | name.endsWith(" ")) | (counter > 1 | counter == 0  )){// проверяет длину
            return false;
        }
        return true;
    }
}
