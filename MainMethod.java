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

        // creating instance of static nested class.
        // obj of outer nested class is not required.
        StaticNestedEg.NestedClass nc = new StaticNestedEg.NestedClass();
        nc.print();

        // calling non static inner class
        // obj of outer class is required.
        InnerClassEg objEg = new InnerClassEg();
        InnerClassEg.InnerClass eg = objEg.new InnerClass();
        eg.print();

        // local inner class.
        LocalInnerClassEg ob = new LocalInnerClassEg();
        ob.display();

        InnerClassInheritance objj = new InnerClassInheritance();
        InnerClassInheritance.InnerClass2 objj1 = objj.new InnerClass2();
        objj1.display();
    }
}
