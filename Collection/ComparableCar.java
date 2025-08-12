package Collection;

public class ComparableCar implements Comparable<ComparableCar> {
    String carName;
    String carType;

    ComparableCar(String name, String type) {
        this.carName = name;
        this.carType = type;
    }
    @Override
    public int compareTo(ComparableCar o) {
        return this.carType.compareTo(o.carType);
    }
}
