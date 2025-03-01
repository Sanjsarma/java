public class InnerClassEg {
    int instVar = 10;
    static int classVar = 20;

    class InnerClass {
        public void print() {
            System.out.println(classVar + instVar);
        }
    }

}
