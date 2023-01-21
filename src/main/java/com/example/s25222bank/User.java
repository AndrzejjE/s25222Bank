package com.example.s25222bank;

public class User {
    private String accId;

    @Override
    public String toString() {
        return "User{" +
                "accId='" + accId + '\'' +
                '}';
    }

    public String getAccId() {
        return accId;
    }

    public void setAccId(String accId) {
        this.accId = accId;
    }

    public User(String accId) {
        this.accId = accId;
    }
}
