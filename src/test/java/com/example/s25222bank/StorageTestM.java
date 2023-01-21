package com.example.s25222bank;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class StorageTestM {
    @MockBean
    private Storage storage;

    @DisplayName("Testowanie wszystkich kont")
    @Test
    void Test() {
        List<Account> allAccount = new ArrayList<>();
        allAccount.add(new Account(10, 10));
        allAccount.add(new Account(11, 103));
        allAccount.add(new Account(12, 102));

        when(storage.getAccounts()).thenReturn(allAccount);

        List<Account> result = storage.getAccounts();
        assertEquals(allAccount, result);
    }

    @Test
    void testFindByID() {
        Account first = new Account(22, 4);

        when(storage.findByID(22)).thenReturn(first);

        Account result = storage.findByID(22);

        assertEquals(first, result);
        assertEquals(22, result.getID());
    }



}