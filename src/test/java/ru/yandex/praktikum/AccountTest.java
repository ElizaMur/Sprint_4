package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AccountTest {
    String name;
    Boolean expected;

    public AccountTest(String name, Boolean expected) {
        this.name = name;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getAccountData() {
        return new Object[][]{
                {"Александр Михайлов", true},
                {"Л И", true},
                {"ТимотейШевроле", false},
                {"   ", false},
                {"Е ", false},
                {"Александр Михайлович", false},
                {"Елизавета ", false},
                {" Елизавета", false},
                {"Елиз авета Мурзина", false},
        };
    }

    @Test
    public void checkAccount() {
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss(name);
        assertEquals(expected, actual);
    }
}