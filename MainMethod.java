public class MainMethod {
    public static void main(String[] args) {
        StaticMethod obj = new StaticMethod();
        obj.display(); // is not correct static methods are accessible only by the class, not by the objects.

        // correct implementation:
        StaticMethod.display();

        //static variables accessing : 
        StaticVariables obj1 = new StaticVariables();
        System.out.println(obj1.add());
        System.out.println(obj1.b);
        //accessing static variable - via the class name
        System.out.println(StaticVariables.a);


        Employee emp = new Employee(10);
        emp.getData();
        Employee emp1 = new Employee("Sanjana", 10);
        emp1.getData();

        // calling private constructor
        PrivateCons.getData();

        Manager m = new Manager(10);
        m.getData();


        // calling abstract classes.
        Audi a = new Audi(10);
        a.pressDualBreakSystem();
        a.pressClutch();
    }
}
