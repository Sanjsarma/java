public abstract class LuxuryCar extends Car{
    // this class cannot have an object.
    public LuxuryCar( int mileage ) {
       super(mileage);
    }

    public abstract void pressDualBreakSystem();

    @Override
    public void pressBreak(){
        System.out.println("Pressing break");
    };
}
