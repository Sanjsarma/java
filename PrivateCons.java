public class PrivateCons {
    int id;

    // private constructor
    private PrivateCons() {
        System.out.println("Private constructor");
    }

    // should be static so that it can be directly called with class name
    // singleton pattern
    public static PrivateCons getData () {
       return new PrivateCons();
    }
}
