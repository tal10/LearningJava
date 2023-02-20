package com.learning;

import com.learning.tirgul.A;
import com.learning.tirgul.B;
import com.learning.tirgul.C;

public class MainInheritance {
    public static void printTheEmployee(Employee emp) {
        emp.print();
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Benni", 6000);
        System.out.println(e1);

        Manager m1 = new Manager();
        m1.setName("Yossi 1");
        m1.setSalary(10000);
        m1.setDeparture("Sales");
        System.out.println(m1);

        Manager m2 = new Manager("Yossi 2", 10000, "Sales");
        System.out.println(m2);

        e1.print();
        m1.print();

        Object obj = new Object();
        // obj.toString();
        // obj.equals();
        Employee emp1 = new Employee("Benni", 6000);
        Employee emp2 = new Employee("Benni", 6000);
        System.out.println(emp1 == emp2); // בדיקה האם שני אובייקטים מצביעים לאותו מקום
        System.out.println(emp1.equals((Object) emp2));  // Execute Object equals
        System.out.println(emp1.equals(emp2));          // Execute Employee equals


        // פולימורפיזם - רב צורתיות, מאפשר להסתכל על אובייקט כלשהו כאל אובייקט אחר
        // שיוצרים אובייקט, נצטרך גם איזשהו מצביע שדרכו נוכל לגשת לאובייקט
        // בעזרת new יוצרים אובייקט, סוג האובייקט שנוצר הוא מהמחלקה שרשומה לצד ה new
        // למצביע לאובייקט יש טיפוס משלו, טיפוס זה הוא בעצם יקבע מה שהקומפיילר יחשוב שהוא טיפוס אובייקט
        // אם נשים את הפולימורפיזם בצד, טיפוס האובייקט האמיתי וטיפוס המצביע חייבים להיות אותו דבר
        // אבל הפולימורפיזם מאפשר גם אחרת
        // אובייקט יכול להיות מוצע על ידי מצביע מטיפוס עצמו או מטיפוס כלשהו במעלה עץ הירושה  - כלומר מחלקת האב / האב של האב והלאה
        Employee employee = new Manager("Danny", 20000, "R&D");


        Manager m10 = new Manager("Danny 1", 20000, "R&D");
        Employee m11 = new Manager("Danny 2", 20000, "R&D");
        Object m12 = new Manager("Danny 3", 20000, "R&D");

        // הפעולה שתופעל עבור אובייקט כלשהו היא בהתאם לסוג האמיתי של האובייקט ולא בהתאם לסוג המצביע
        m10.print();
        m11.print();

        // m12.print();
        ((Employee) m12).print();
        ((Manager) m12).print();

        // -----------------------------------------------

        // לפעמים יהיו מצבים שיש לנו אובייקט מסוים שמוצבע על ידי מצביע מטיפוס אחר
        // ונרצה להפעיל פעולות של האובייקט המסוים שלא קיימות בטיפוס המצביע והקומפיילר לא יאפשר לנו להפעיל אותן
        // כדי להתגבר על זה נצטרך לבצע casting המרה - down casting במקרה הזה

        // ניתן לבצע down casting לכל המחלקות שנמצאות במורד עץ הירושה של הטיפוס של המצביע
        // צריך להיזהר עם down casting, אם נמצא המרה לא חוקית, נקבל שגיאת זמן ריצה

        m10.manage();
        // m11.manage();
        ((Manager) m11).manage();

        Manager temp = (Manager) m11;
        temp.manage();


        // ((Rectangle)m11).getButtomRight();        - לא אפשרי - שגיאת קומפילציה
        // ((SuperManager)m11).test();               - אפשרי - אך נקבל שגיאת זמן ריצה
        // ((Rectangle)m12).getButtomRight();        - אפשרי - אך נקבל שגיאת זמן ריצה


        // בעזרת instanceof ניתן לבדוק האם אובייקט מסוים הוא מסוג מסוים כדי להימנע מהמרות לא חוקיות
        // למעשה instanceof בודק האם האובייקט הוא מסוג ה type שרשמנו בצד ימין ל instanceof
        // או שה type הזה הוא מחלקת האב של הסוג האמיתי של האובייקט או מחלקת הסבא או כל מחלקה במעלה עץ הירושה
        if (m12 instanceof Rectangle) {
            System.out.println(((Rectangle) m12).getButtomRight());
        }

        boolean boolExpression = 3 == 2;
        boolExpression = 4 > 5;
        boolExpression = m12 instanceof Rectangle;
        System.out.println("m12 instanceof Rectangle - " + (m12 instanceof Rectangle));

        System.out.println("m12 instanceof Manager - " + (m12 instanceof Manager));
        System.out.println("m12 instanceof Employee - " + (m12 instanceof Employee));
        System.out.println("m12 instanceof Object - " + (m12 instanceof Object));

        // ------------------------------------------------------
        System.out.println("------------------------------------------------------");

        Employee empFactory1 = new Employee("Employee 1", 6000);
        Employee empFactory2 = new Employee("Employee 2", 7000);
        Employee empFactory3 = new Employee("Employee 3", 8000);
        Manager empFactory4 = new Manager("Employee 4", 20000, "R&D");
        Manager empFactory5 = new Manager("Employee 5", 18000, "Sales");
        SuperManager empFactory6 = new SuperManager();

        System.out.println(empFactory1);
        System.out.println(empFactory2);
        System.out.println(empFactory3);
        System.out.println(empFactory4);
        System.out.println(empFactory5);
        System.out.println(empFactory6);

        System.out.println("------------------------------------------------------");

        Employee[] employees = new Employee[3];
        employees[0] = empFactory1;
        employees[1] = empFactory2;
        employees[2] = empFactory3;

        Manager[] managers = new Manager[2];
        managers[0] = empFactory4;
        managers[1] = empFactory5;

        SuperManager[] superManagers = new SuperManager[1];
        superManagers[0] = empFactory6;

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        for (int i = 0; i < managers.length; i++) {
            System.out.println(managers[i]);
        }
        for (int i = 0; i < superManagers.length; i++) {
            System.out.println(superManagers[i]);
        }

        System.out.println("------------------------------------------------------");

        // ברגע שמגדירים מערך מסוג מסוים, ניתן להכניס אליו אובייקטים מהסוג שממנו נוצר המערך ואף אובייקטים ממחלקות שיורשות את הסוג שממנו נוצר המערך
        Employee[] allEmployees = new Employee[6];
        allEmployees[0] = empFactory1;
        allEmployees[1] = empFactory2;
        allEmployees[2] = empFactory3;

        allEmployees[3] = empFactory4;
        allEmployees[4] = empFactory5;

        allEmployees[5] = empFactory6;

        int count = 0;
        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println(allEmployees[i]);
            allEmployees[i].print();

            if (!(allEmployees[i] instanceof Manager))
                count++;

            /*
            // בדיקה האם משתנה מסויים הוא מסוג מחלקה מסוימת (ולא כולל היורשים שלה)
            if (allEmployees[i].getClass() == Employee.class) {
                count++;
            }
            */
        }
        System.out.println("count: " + count);

        // ------------------------------

        Object[] arr = new Object[10];
        arr[0] = new Employee("Employee 1", 6000);
        arr[1] = new Manager("Employee 4", 20000, "R&D");
        arr[2] = new SuperManager();
        arr[3] = 10;
        arr[4] = 10.5;
        arr[5] = false;

        int num = 10;
        long l = 5436456456456l;
        double d = 10.4;
        float f = 35.345f;
        char ch = '@';
        boolean b = true;

        Integer num2 = new Integer(10);
        Long l2 = new Long(10l);
        Double d2 = new Double(10.4);
        Float f2 = new Float(35.345f);
        Character ch2 = new Character('@');
        Boolean b2 = new Boolean(true);

        arr[6] = num2;
        arr[7] = l2;

        int num3 = 10;
        arr[8] = num3;

        // ------------------------------

        // שפעולה מקבלת משתנה מסוג מחלקה מסויימת, ניתן לזמן את הפעולה ולשלוח לה אובייקט מאותו הסוג כמובן
        // או אובייקטים ממחלקות שיורשות את המחלקה של סוג המשתנה שהפעולה מקבלת
        Employee empForFunc1 = new Employee("Employee 1", 6000);
        printTheEmployee(empForFunc1);

        Manager empForFunc2 = new Manager("Employee 4", 20000, "R&D");
        Employee empForFunc3 = new Manager("Employee 4", 20000, "R&D");
        printTheEmployee(empForFunc2);
        printTheEmployee(empForFunc3);

        SuperManager empForFun4 = new SuperManager();
        Manager empForFun5 = new SuperManager();
        Employee empForFun6 = new SuperManager();
        printTheEmployee(empForFun4);
        printTheEmployee(empForFun5);
        printTheEmployee(empForFun6);
    }
}
