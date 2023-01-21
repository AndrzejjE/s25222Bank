package com.example.s25222bank;

public class Account {

    private int ID;
    private int saldo;
private User user;
    public Account(int ID, int saldo) {
        this.ID = ID;
        this.saldo = saldo;
    }

    public Account(int ID, int saldo, User user) {
        this.ID = ID;
        this.saldo = saldo;
        this.user = user;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }


    @Override
    public String toString() {
        return "Account{" +
                "ID=" + ID +
                ", saldo=" + saldo +
                ", user=" + user.getAccId() +
                '}';
    }
}
