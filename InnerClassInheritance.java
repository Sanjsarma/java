public class InnerClassInheritance {
    int instanceVar = 1;
    static int classVar = 2;

    class InnerClass1 {
        int innerClass1 = 3;
    }

    class InnerClass2 extends InnerClass1 {
        int innerClass2 = 4;
        void display() { 
            System.out.println(innerClass1+ instanceVar+ innerClass2+classVar);
        }
    }
    
}
