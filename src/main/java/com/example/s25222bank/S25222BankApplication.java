package com.example.s25222bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class S25222BankApplication {


    private AccountService accountService;
    private Storage storage;

    public S25222BankApplication(AccountService accountService,Storage storage) {
        this.accountService = accountService;
        this.storage = storage;
        storage.addAccount(new Account(3,1000));
        System.out.println(storage.getAccounts());
    }
    public static void main(String[] args) {
        SpringApplication.run(S25222BankApplication.class, args);
    }

}
