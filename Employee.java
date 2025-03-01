public class Employee {
    private String name;
    private int empId;

    // constructor chaining eg.
    // this calls next cons
    Employee() {
        this(10);
    }

    // this calls next cons
    Employee(int empId) {
        this("Sanjana", empId);
    }
    // constructor overloading
    Employee (String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    public void getData () {
        System.out.println(this.name + " " + this.empId);
    }
}