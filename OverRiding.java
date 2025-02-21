// dynamic or run time polymorphism or overridding
public class OverRiding {
    public void show () {
        System.out.println("BaseClass");
    }
    public static void main (String[] args) {
        OverRiding egObj = new OverRiding();
        egObj.show();
        // dynamic dispatch - method will be called based on the actual type of the object at runtime, not the type of the reference variable.
        // here obj is of type ChildClass hence o/p - DerivedClass.
        ChildClass obj = new ChildClass();
        obj.show();
        // here egObj is of type OverRiding hence o/p - DerivedClass.
        OverRiding egObj1 = new ChildClass();
        egObj1.show();
    }
}

class ChildClass extends OverRiding {
    public void show() {
        System.out.println("Derived class");
    }
}



