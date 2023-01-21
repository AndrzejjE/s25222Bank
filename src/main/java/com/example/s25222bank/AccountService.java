package com.example.s25222bank;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountService {
    private Storage storage;

    private ServiceStorage serviceStorage;


    private int price;

    public AccountService(Storage storage, ServiceStorage serviceStorage) {
        this.storage = storage;
        this.serviceStorage = serviceStorage;
    }

    public List<Account> getAllAccount() {
        return storage.getAccounts();
    }

    public List<Service> getAllService() {
        return serviceStorage.getServices();
    }

  /* public Account createAccount(User user, int ID, int saldo) {
        if (storage.findByID(ID) != null) {
            System.out.println("Stworzono konto");
        }else System.out.println("Juz jest takie konto(o podanym ID)");
   }*/
}
