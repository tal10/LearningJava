package com.learning.testMoedA;

public class Family implements Countable {
    private int numOfParents;
    private int numOfChildren;

    public Family(int numOfParents, int numOfChildren) {
        this.numOfParents = numOfParents;
        this.numOfChildren = numOfChildren;
    }

    @Override
    public int count() {
        return this.numOfParents + this.numOfChildren;
    }
}