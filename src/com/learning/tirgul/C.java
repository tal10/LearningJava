package com.learning.tirgul;

public class C extends A {
    public C(int n) {
        super(n);
        System.out.println("F in C");
    }

    public boolean f(A a) {
        return a instanceof C && num == a.num;
    }
}