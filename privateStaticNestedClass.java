public class privateStaticNestedClass {

    int instanceVar = 10;
    static int classVar = 20;

    private static class NestedClass {
        public void print() { 
            System.out.println(classVar);
        }
    }

    // method should be created as the object of nested class should be defined in the class itself.
    public void display () {
        NestedClass obj = new NestedClass();
        obj.print();
    }
    
}
