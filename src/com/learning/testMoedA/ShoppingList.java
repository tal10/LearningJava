package com.learning.testMoedA;

public class ShoppingList implements Comparable, Countable {
    private Item[] items;

    public ShoppingList(Item[] items) {
        this.items = items;
    }

    @Override
    public int count() {
        return this.items.length;
    }

    public double getPrice() {
        double sum = 0;
        for (int i = 0; i < this.items.length; i++) {
            sum += this.items[i].getPrice();
        }
        return sum;
    }

    @Override
    public boolean isEqual(Object obj) {
        /*
        if (this.count() == ((ShoppingList)obj).count())
            return true;
        return false;
        */

        if (this.getPrice() == ((ShoppingList)obj).getPrice())
            return true;
        return false;
    }

    @Override
    public boolean isGreater(Object obj) {
        /*
        if (this.count() > ((ShoppingList)obj).count())
            return true;
        return false;
        */

        if (this.getPrice() > ((ShoppingList)obj).getPrice())
            return true;
        return false;
    }
}
