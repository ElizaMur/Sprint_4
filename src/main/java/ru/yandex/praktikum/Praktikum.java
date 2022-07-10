package ru.yandex.praktikum;

public class Praktikum {
    public static void main(String[] args) {
        String name = "Елизавета Мурзина";
        Account account = new Account(name);
        account.checkNameToEmboss(name);
    }
}
