public class AbstractChild extends AbstractClass {
    public void abstractMethod () { 
        System.out.println("I'm the child's abstract method");
    }

    public static void main (String[] args) {
        AbstractChild obj = new AbstractChild();
        obj.abstractMethod();
        obj.display();
    }
}
