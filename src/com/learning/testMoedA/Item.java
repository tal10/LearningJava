package com.learning.testMoedA;

public class Item implements Comparable {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean isEqual(Object obj) {
        return false;
    }

    @Override
    public boolean isGreater(Object obj) {
        return false;
    }
}
