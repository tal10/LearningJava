package com.learning;

import java.util.Objects;

// הגדרת מחלקה
public class Person {
    // תכונות - משתנים
    // ברגע שנוצר אובייקט, אוטומטית נוצרים כל משתני המחלקה פר האובייקט, וכל אחד מהם מקבל את הערך הדיפולטי בהתאם לסוג המשתנה שלו
    private int age;
    private String name;

    // הפעולה הבונה - constructor
    // פעולה מיוחדת שמטרתה לאתחל את תכונות האובייקט
    // פעולה שנקראת אוטומטית בעת יצירת האובייקט
    // לא מציינים מה פעולה מחזירה
    // שם הפעולה הבונה הוא כשם המחלקה
    // ניתן ליצור כמה פעולות בונות, צריך רק שיהיה הבדל ביניהם בפרמטרים שהם מקבלים
    // אם לא כתבנו בכלל פעולה בונה למחלקה, אז אוטומטית נוצרת פעולה בונה ריקה למחלקה

    // פעולה בונה שלא מקבלת פרמטרים - default constructor
    public Person() {
        NUM_OF_PERSONS++;
    }

    // פעולה בונה עם פרמטרים
    public Person(int age, String name) {
        NUM_OF_PERSONS++;

        this.age = age;
        this.name = name;
    }

    // פעולות
    public void print() {
        System.out.println("Hello I am a person");
    }

    // פעולות get ו set
    // פעולות set
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    // פעולות get
    public int getAge() {
        return this.age;
    }

    public String getName() {
        return name;
    }

    // פעולת ה toString
    // פעולה שמטרתה להחזיר תיאור של האובייקט
    // הפעולה מופעלת אוטומטית ברגע שמדפיסים את האובייקט

    @Override
    public String toString() {
        return "Age: " + this.age + ", Name: " + this.name;
    }

    public boolean equals(Person other) {
        if ((this.age == other.age) && (this.name.equals(other.name)))
            return true;
        return false;
    }

    // ----- Static -----
    // למחלקה יכולים להיות תכונות ופעולות רגילות של המחלקה וגם תכונות ופעולות סטטיות
    // כדי לציין שתכונה או פעולה מסויימת היא סטאטית נרשום את המילה static אחרי הרשאת הגישה

    // פעולות סטטיות
    // פעולות המחלקה הלא סטטיות, כדי להפעיל אותם, חייב אובייקט
    // כדי להפעיל פעולות סטטיות אין צורך באובייקט פשוט מפעילים אותם דרך שם המחלקה
    // פעולות סטטיות לא יכולות לגשת לתכונות ופעולות המחלקה שהם לא סטטיות
    public static void Test() {
        System.out.println("Hello from static method");
    }

    // משתנים סטטים
    // משתנה סטטי נוצר פעם אחת פר מחלקה לעומת משתנה של המחלקה (תכונה) שהוא נוצר פר אובייקט
    // הגישה למשתנה סטטי הוא דרך שם המחלקה
    // ניתן לגשת למשתנים הסטטים גם מתוך הפעולות הסטטיות וגם מתוך הפעולות הרגילות שהם לא סטטיות
    private static int NUM_OF_PERSONS = 0;

    public static int getNumOfPersons() {
        return NUM_OF_PERSONS;
    }
}

// איברי המחלקה - התכונות והפעולות שבמחלקה
// לכל אחד מאיברי המחלקה יש הרשאת גישה - public / private
// איבר מחלקה שהוגדר כ private - ניתן לגשת אליו אך ורק מתוך קוד המחלקה
// איבר מחלקה שהוגדר כ public - ניתן לגשת אליו מכל מקום בקוד

// התכונות הן למעשה משתנים

// הפעולות הן פעולות רגילות
// פעולות המחלקה יכולות לגשת ואף לשנות את תכונות המחלקה

// נהוג שתכונות המחלקה יהיו private
// נהוג שפעולות המחלקה יהיו public

// פעולות גישה - access method - פעולות get ו set - פעולות שבעזרתן ניתן לגשת ולשנות את תכונות המחלקה
// בעזרת פעולות ה get ניתן לקבל את ערך התכונות של המחלקה
// בעזרת פעולות ה set ניתן לקבוע/לשנות את ערך תכונות המחלקה