package com.learning.testMoedA;

public class TestAB {
    public static void main(String[] args) {
        A a1 = new A(5);
        A a2 = new A(a1);

        A a3 = null;
        a3.setX(10);
    }
}
