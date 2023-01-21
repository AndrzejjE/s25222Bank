package com.example.s25222bank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class StorageTest {

    private Storage storage;

    @DisplayName("Testowanie utworzenia nowego konta")
    @Test
    public void Test1() {

        Storage storage = new Storage();
        int initialSize = storage.getAccounts().size();


        Account newAc = storage.addAccount(new Account(5,500));

        assertNotEquals(initialSize, storage.getAccounts().size());
    }

    @DisplayName("Testowanie wpłaty")
    @Test
    void Test2() {
        Storage storage = new Storage();
        Account account = storage.findByID(1);
        int first = account.getSaldo();

        storage.addSaldo(1,100000);
        account = storage.findByID(1);
        int second = account.getSaldo();

        assertNotEquals(first,second);
    }

    @DisplayName("Testowanie wypłaty")
    @Test
    void Test3() {
        Storage storage = new Storage();
        Account account = storage.findByID(1);
        int first = account.getSaldo();

        storage.lessSaldo(1,10);
        account = storage.findByID(1);
        int second = account.getSaldo();

        assertNotEquals(first,second);
    }
}