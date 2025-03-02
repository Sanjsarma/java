package Interface;

// both inner and outer can be inherited as well. then both have to be implemented.
public class NonFlying implements BirdNested.NonFlyingBird{

    @Override
    public void canRun() {
        System.out.println("can run");
    }
}
