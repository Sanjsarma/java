public class Synchronization {
    
    private static Synchronization obj;

    private Synchronization() {

    }

    synchronized public static Synchronization getInstance() {
        if (obj == null) {
            obj = new Synchronization();
        }
        return obj;
    }
}
