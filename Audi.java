// only for concrete classes, objects can be created.
public class Audi extends LuxuryCar {

    Audi(int mileage) {
        super(mileage);
    }
    
    @Override
    public void pressDualBreakSystem(){
        System.out.println("Pressing dual break system");
    }

    @Override
    public void pressClutch() {
        System.out.println("Pressing clutch");
    }
}
