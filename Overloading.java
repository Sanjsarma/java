// static or compile time polymorphism or overloading
public class Overloading{
    public int area(int a, int b) {
        return a*b;
    }
    public double area(int r){
        return Math.PI * r * r;
    }
    public static void main(String[] args) {
        Overloading eg = new Overloading();
        System.out.println(eg.area(4,5));
        System.out.println(eg.area(1));
    }

}