package com.example.s25222bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Storage {
    private Account account1 = new Account(1,100);
    private Account account2 = new Account(2,100);

    private List<Account> accounts = new ArrayList<>();

    public Storage() {
        accounts.add(account1);
        accounts.add(account2);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public Account findByID(int ID) {
        for (Account account : accounts) {
            if (account.getID() == ID) {
                return account;
            }
        }
        return null;
    }
    public Account addAccount(Account account) {
        accounts.add(account);
        return account;
    }

    public void addSaldo(int ID, int add) {
        Account account = findByID(ID);
        if (account != null) {
            account.setSaldo(account.getSaldo() + add);
        }
    }

    public void lessSaldo(int ID, int less) {
        Account account = findByID(ID);
        int no = account.getSaldo() - less;
        if (account != null) {
            if (no > 0) {
                account.setSaldo(account.getSaldo() - less);
            } else System.out.println("nie ma wystarczających srodków na koncie");
        }
    }


}
