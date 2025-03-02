package Interface;

public interface BirdNested {

    public void canFly();

    public interface NonFlyingBird {
        public void canRun();
    }
    
}
