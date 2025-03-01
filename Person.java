public class Person {

    private int empId;
    public Person() {
        System.out.println("Inside person"); 
      
    }

    public Person(int empId) {
      this.empId = empId;
    }

    public void getData () {
        System.out.println(this.empId);
    }
}
