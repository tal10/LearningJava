package com.learning;

// הרשאת הגישה protected - הרשאת גישה שהיא בין public שנגיש לכולם ובין private שנגיש אך ורק למחלקה שזה הוגדר האיבר כ private
// איבר במחלקה שהוגדר כ protected נגיש מהמחלקה שבה הוא הוגדר וגם מהמחלקות היורשות
// לפעמים נגדיר תכונות במחלקת האב כ protected כדי שניתן יהיה לגשת אליהן במחלקת הבן


// כל המחלקות ב Java אוטומטית יורשות ממחלקת Object
// public class Employee extends Object - הקומפיילר למעשה מוסיף שהמחלקה יורשת מאובגייקט
public class Employee {
    protected String name;
    protected int salary;

    public Employee() {

    }

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name='" + name + "'" + ", salary=" + salary;
    }

    public void print() {
        System.out.println("Hello I am Employee and my name is: " + this.name);
    }

    public boolean equals(Employee other) {
        if ((this.name.equals(other.name)) && (this.salary == other.salary))
            return true;
        return false;
    }
}
