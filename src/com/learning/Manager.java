package com.learning;

// בירושה, כל התכונות והפעולות של מחלקת האב מועתקות למחלקת הבן
// הפעולות הבונות - constructors לא מועתקות
public class Manager extends Employee {
    private String departure;

    public Manager() {
        super();
    }

    // בכל פעולה בונה של מחלקה שיורשת מחלקה אחרת חייבת להיות קריאה לפעולה הבונה של מחלקת האב
    // באמצעות המילה super מבצעים קריאה לפעולה הבונה של מחלקת האב
    // אם לא קראנו לפעולה הבונה של מחלקת האב בפעולה בונה כלשהי של מחלקת הבן אז אוטומטית תתווסף הקריאה לפעולה הבונה הדיפולטית (הריקה) של מחלקת האב - כלומר תתווסף הקריאה: super()

    // דוגמה:
    // super() - יפעיל את הפעולה הבונה של מחלקת האב שלא מקבלת כלום
    // super(10, "Test") - יפעיל את הפעולה הבונה של מחלקת האב שמקבלת מספר ומחרוזת

    // הקריאה ל super חייבת להיות בשורה הראשונה של הפעולה הבונה בלבד

    public Manager(String name, int salary, String departure) {
        super(name, salary);
        this.departure = departure;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    // כאשר במחלקת הבן אנו כותבים פעולה עם אותה חתימה שקיימת במחלקת האב, אנחנו למעשה דורסים אותה
    @Override
    public String toString() {
        // return "name='" + name + "'" + ", salary=" + salary + ", departure='" + this.departure;
        return super.toString() + ", departure='" + this.departure + "'";
    }

    @Override
    public void print() {
        System.out.println("Hello I am Manager and my name is: " + this.name);
    }

    public final void manage() {
        System.out.println("I am managing now...");
    }
}
