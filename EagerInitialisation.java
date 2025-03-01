public class EagerInitialisation {
    
    // obj is created in advance. static : only class can access. also private.
    private static EagerInitialisation obj = new EagerInitialisation();

    // constructor is made private. only this class can create objs.
    private EagerInitialisation() {
    }

    // public so that other classes can call this for getting the instance.
    // static as other classes can access using the class name.
    // it is pre-loaded into memory, even if not being used. this is a disadvantage.
    public static EagerInitialisation getInstance() {
        return obj;
    }
}
