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
    }
}
