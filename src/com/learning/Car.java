package com.learning;

// כדי לממש ממשק, נשתמש במילה implements ואחריה נרשום את הממשק אותו אנו רוצים לממש
// חייב לממש את פעולות הממשק, פעולות אלו חייבות להיות public

// מחלקה יכולה לרשת מחלקה אחת בלבד
// מחלקה יכולה לממש כמה ממשקים שהיא רוצה
public class Car implements IMovable {
    private String modelName;
    private int year;

    public Car(String modelName, int year) {
        this.modelName = modelName;
        this.year = year;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", year=" + year +
                '}';
    }

    public void fillGas() {
        System.out.println("I am now in the gas station");
    }

    public void move() {
        System.out.println("I am a car and I am moving with 4 wheels");
    }
}
