package com.learning;

public class MainInterface {

    public static void main(String[] args) {
        Car car1 = new Car("Mazda", 2020);
        Car car2 = new Car("Toyota", 2022);
        Person person1 = new Person(20, "Benni");

        // בירושה הקשר הוא: "סוג של"
        // לדוגמה מנהל הוא סוג של עובד

        // במימוש ממשק הקשר הוא: "מתפקד כ" / "בעל יכולת של"
        // לדוגמה רכב מתפקד כ "יכולת לזוז" / רכב מעל יכול של "יכולת לזוז"

        // ניתן ליצור מצביע מסוג ממשק
        // מצביע מסוג ממשק יכול להצביע אך ורק על אובייקטים מסוג מחלקות שמממשות את הממשק
        IMovable m1;
        m1 = car1;

        // לא ניתן לייצר אובייקטים מממשק
        // IMovable m = new IMovable(); // שגיאת קומפילציה

        IMovable m2 = new Car("Tesla", 2023);
        IMovable m3 = new Person(50, "Eilon");
        ((Person) m3).getName();

        m1.move();

        car1.fillGas();
        ((Car) m1).fillGas();

        if (m1 instanceof Person) {
            ((Person) m1).setName("Yossi");
        }

        // בעזרת instanceof ניתן גם לבדוק האם אובייקט מסוים מממש ממשק מסוים
        if (car1 instanceof IMovable) {
            System.out.println("Car is implements IMovable");
        }

        IMovable m5 = (IMovable) car1;

        /*
        Point p = new Point(10, 20);
        Employee e = new Employee("test", 1000);
        IMovable m6 = (IMovable)p;
        IMovable m7 = (IMovable)e;
        */

        // ניתן ליצור מערך מסוג ממשק
        // לתוך המערך נוכל להכניס אך ורק אובייקטים שמממשים את הממשק
        IMovable[] arr = new IMovable[3];
        arr[0] = car1;
        arr[1] = car2;
        arr[2] = person1;

        for (int i = 0; i < arr.length; i++) {
            arr[i].move();
        }
    }
}
