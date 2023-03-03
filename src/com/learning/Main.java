package com.learning;

public class Main {

    public static void main(String[] args) {
        // משתנים פרימיטיביים
        int num = 10;
        long l = 5436456456456l;
        double d = 10.4;
        float f = 35.345f;
        char ch = '@';
        String str = "hdfbguit793yt%^#$*#uhrgiue";
        boolean b = true;
        b = false;

        int[] array = new int[3];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        int[] array2 = {10, 20, 30};

        // הגדרת משתנה כקבוע, לא ניתן לשנות ערכו לאחר ההשמה הראשונית
        final int finalNum = 20;
        // finalNum = 30; // שגיאת קומפילציה

        // ניתן להגדיר את המשתנה הקבוע, ולתת לו את הערך ההתחלתי בהמשך
        final int finalNum2;
        finalNum2 = 10;
        // finalNum2 = 20;  // שגיאת קומפילציה

        // -------------------------------------------

        // ברגע שיש מחלקה, ניתן ליצור ממנה משתנים - אובייקטים / עצמים
        Person p1 = new Person();

        // p1.age = 20;
        p1.setAge(20);

        p1.setName("Yossi");

        // System.out.println(p1.age);
        System.out.println(p1.getAge());

        p1.print();

        // -------------------------------------------

        Person p2 = new Person(30, "Benni");

        Person p3 = new Person();
        p3.setAge(30);
        p3.setName("Benni");

        // -------------------------------------------

        System.out.println("--------------------------");
        System.out.println(num);
        System.out.println(d);
        System.out.println(str);
        System.out.println(b);

        System.out.println(p1.toString());
        System.out.println(p2);
        System.out.println(p3);

        // -------------------------------------------

        Point point = new Point(10, 20);
        System.out.println(point);

        Point pnt1 = new Point(10, 20);
        Point pnt2 = new Point(100, 200);
        Rectangle r1 = new Rectangle(pnt1, pnt2);

        Rectangle r2 = new Rectangle();

        System.out.println("--------------------------");
        System.out.println(r1);
        pnt1.setX(50);
        pnt1.setY(500);
        System.out.println(r1);

        // -------------------------------------------

        // הפעלת פעולה סטטית
        Person.Test();

        System.out.println(Point.distance(pnt1, pnt2));

        // גישה למשתנה סטטי
        // Person.NUM_OF_PERSONS = 10;
        // System.out.println("Num of created persons: " + Person.NUM_OF_PERSONS);
        System.out.println("Num of created persons: " + Person.getNumOfPersons());

        // -------------------------------------------
        System.out.println("--------------------------");

        int num1 = 10;
        int num2 = 10;
        int num3 = 20;

        // == | != | < | > | <= | >=
        boolean b1 = num1 == num2;
        System.out.println(b1);
        System.out.println(num1 == num3);

        p1 = new Person(10, "Benni");
        p2 = new Person(10, "Benni");

        // פעולת ה ==
        // במשתנים פרימיטיביים היא תבדוק האם יש לשני משתנים את אותו הערך
        // באובייקטים, הפעולה תבדוק האם המצביעים שאותם משווים מצביעים על אותו מקום
        System.out.println(p1 == p2);

        // = - משפט השמה
        // צד ימין מחושב ואז נכנס לתוך צד שמאל
        // בהשמה של מצביעים, לאיפה שצד ימין מצביע, עכשיו גם צד שמאל יצביע
        p1 = p2;
        System.out.println(p1 == p2);

        p1 = new Person(10, "Benni");
        p2 = new Person(10, "Benni");
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));

        // -------------------------------------------
        System.out.println("--------------------------");

        int[] arr = new int[10];
        arr[0] = 10;
        arr[2] = 20;
        arr[arr.length - 1] = 50;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // מערך אובייקטים
        Person[] persons = new Person[3];
        persons[0] = new Person(20, "Danny");
        persons[1] = p1;
        persons[2] = p2;
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }


        int n1 = 10;
        int n2 = 20;
        System.out.println("Before: n1 = " + n1 + ", n2 = " + n2);
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After: n1 = " + n1 + ", n2 = " + n2);


        int x = 10;
        int y = 20;
        System.out.println("Before: x = " + x + ", y = " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After: x = " + x + ", y = " + y);

        // -------------------------------------

        // null - ערך ריק עבור מצביעים
        Person p = new Person(10, "Benni");
        p = new Person(10, "Benni");
        p = null;
    }
}
