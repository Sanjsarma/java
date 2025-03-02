@MyCustomAnnotation(name = "Sanjana")
public class Manager extends Person {
    public Manager() {
        //there is a hidden super() here.
        // super() is added only for default constructors. 
        // this is also an eg. of chaining.
        System.out.println("Inside manager");
    }

    public Manager(int empId) {
        super(empId);
    }
}
