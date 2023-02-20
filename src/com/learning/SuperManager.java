package com.learning;

// ניתן להגדיר מחלקה כ final ואז לא ניתן לרשת אותה יותר
public final class SuperManager extends Manager {
    public void test() {

    }

    @Override
    public void print() {
        System.out.println("Hello I am Super Manager and my name is: " + this.name);
    }

    @Override
    public String toString() {
        return "SuperManager - " + super.toString();
    }

    /*
    // לא ניתן לדרוס פעולה שהוגדרה כ final
    // שגיאת קומפילציה
    public void manage() {
        System.out.println("I am super managing now...");
    }
    */
}
