package com.alex.list;

import java.util.ArrayList;

public class Company {

    private final String name;
    private ArrayList<Factory> factories;

    public Company(final String name) {
        this.name = name;
        this.factories = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFactory(Factory factory) {
        this.factories.add(factory);
    }
}
