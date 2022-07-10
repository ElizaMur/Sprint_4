package ru.yandex.praktikum;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
    private String name = null;
    static int counter = 0;
    public Account(String name) {
        this.name = name;
    }


    public static boolean checkNameToEmboss(final String name) {
        Pattern p = Pattern.compile(" ");
        Matcher m = p.matcher(name);
        counter = 0;
        while (m.find()) {
            counter++;
        }

        if (name.length() < 3 | name.length() > 18) {// проверяет длину
            return false;
        } else if (name.startsWith(" ") | name.endsWith(" ")) { // проверяет пробелы в конце и начале строки
            return false;
        } else if (counter > 1 | counter == 0  ) { // количество пробелов
            return false;
        }
        return true;
    }
}
