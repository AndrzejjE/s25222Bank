package com.example.s25222bank;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServiceStorage {
    List<Service> services = new ArrayList<>();

    public ServiceStorage() {
    }

    public List<Service> getServices() {
        return services;
    }

}
