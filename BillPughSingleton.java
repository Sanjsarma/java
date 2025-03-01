public class BillPughSingleton {

    private BillPughSingleton() {}

    private static class BillPughHelper {
        private static final BillPughSingleton INSTANCE_OBJECT = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return BillPughHelper.INSTANCE_OBJECT;
    }
    
}
