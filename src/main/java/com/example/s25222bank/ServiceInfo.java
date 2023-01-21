package com.example.s25222bank;

public class ServiceInfo {
    private int wplata;

    private int wyplata;

    public ServiceInfo(int wplata, int wyplata) {
        this.wplata = wplata;
        this.wyplata = wyplata;
    }

    public int getWplata() {
        return wplata;
    }

    public void setWplata(int wplata) {
        this.wplata = wplata;
    }

    public int getWyplata() {
        return wyplata;
    }

    public void setWyplata(int wyplata) {
        this.wyplata = wyplata;
    }

    @Override
    public String toString() {
        return "ServiceInfo{" +
                "wplata=" + wplata +
                ", wyplata=" + wyplata +
                '}';
    }


}
