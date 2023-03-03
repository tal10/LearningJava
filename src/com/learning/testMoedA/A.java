package com.learning.testMoedA;

public class A {
    // תכונות
    private int x;

    // פעולות בונות
    public A(int x) {
        this.x = x;
    }

    // copy constructor - פעולה בונה מעתיקה
    public A(A a) {
        this.x = a.x;
    }

    // פעולות
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "x is: " + this.x;
    }
}
