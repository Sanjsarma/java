// abstract class can 0 to n abstract methods.
public abstract class Car {
    int mileage;

    public Car(int mileage) { 
       this.mileage = mileage;
    }

    public abstract void pressBreak();

    public abstract void pressClutch();

    public int getNumberOfWheels() {
        return 4;
    }
    
}
