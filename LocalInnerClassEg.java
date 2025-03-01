public class LocalInnerClassEg {
    // inside any block.
    // only default access modifier.
    public void display() {
        class LocalInnerClass {
            int localVar = 10;
            public void print () {
                System.out.println(localVar);
            }
        }

        // within this block only can local inner classes be initiated.
        LocalInnerClass obj = new LocalInnerClass();
        obj.print();

    }
}
