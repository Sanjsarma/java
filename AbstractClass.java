public abstract class AbstractClass {
    public final void display() {
        System.out.println("I'm a final method");
    }

    // abstract method : only declaration, no implementation in the abstract class.
    // child will inherit and implement this abstract method.
    public abstract void abstractMethod (); 
}
