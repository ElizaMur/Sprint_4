package ru.yandex.praktikum;

public class Praktikum {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {
            Account account = new Account(args[i]);
            account.checkNameToEmboss(args[i]);
        }
    }
}
