public class StaticNestedEg {
    private int instanceVar = 10;
    private static int classVar = 20;

    static class NestedClass {
        public void print() {
            // cannot access instanceVar directly as it is belonging to an object
            StaticNestedEg obj = new StaticNestedEg();
            System.out.println(classVar + obj.instanceVar);
        }
    }
}
